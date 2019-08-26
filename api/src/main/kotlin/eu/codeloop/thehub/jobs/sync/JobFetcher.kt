package eu.codeloop.thehub.jobs.sync

import eu.codeloop.thehub.properties.JobProperties
import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Service
import java.time.OffsetDateTime

@Service
@EnableConfigurationProperties(JobProperties::class)
class JobFetcher(private val jobFetcher: JobApiFetcher, private val jobHtmlFetcher: JobHtmlFetcher, private val jobProperties: JobProperties) {

    private val log = LoggerFactory.getLogger(JobFetcher::class.java)

    fun fetch(host: String): List<Job> {
        val pages = jobFetcher.fetch(host)
        val jobsFromApi = pages.flatMap { it.jobs.docs }
        return jobsFromApi.mapNotNull { api -> fetch(host, api) }
    }

    @SuppressWarnings("TooGenericExceptionCaught")
    private fun fetch(host: String, api: JobApiFetcher.Job): Job? {
        try {
            val html = jobHtmlFetcher.fetchDetails(host, api.key)
            val approvedAt = OffsetDateTime.parse(api.approvedAt ?: jobProperties.`approved-at-default`)
            return Job(
                api.key,
                api.jobPositionTypes?.firstOrNull()?.name ?: "unknown",
                api.locationLabel,
                api.title,
                api.company,
                html.monthlySalary,
                html.equity,
                html.keywords,
                html.description,
                html.perks,
                host,
                approvedAt,
                html.poster
            )
        } catch (e: Exception) {
            log.info("Error on fetching details from ${api.key}", e)
            return null
        }
    }
}
