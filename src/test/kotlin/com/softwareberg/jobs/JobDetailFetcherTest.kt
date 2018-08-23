package com.softwareberg.jobs

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import com.softwareberg.readFile
import org.assertj.core.api.Assertions.assertThat
import org.jsoup.Jsoup
import org.junit.jupiter.api.Test

class JobDetailFetcherTest {

    private val htmlFetcher = mock<HtmlFetcher>()
    private val jobDetailFetcher = JobDetailFetcher(htmlFetcher)

    @Test
    fun `it should fetch job details`() {
        // given
        whenever(htmlFetcher.get(any())).doReturn(Jsoup.parse(readFile("/http/jobs/job.html")))
        val key = "social-media-specialist-wanted"

        // when
        val job = jobDetailFetcher.fetchDetails(key)

        // then
        assertThat(job.monthlySalary).isEqualTo("Competitive")
        assertThat(job.equity).isEqualTo("To be negotiated")
        assertThat(job.keywords).hasSize(8).contains("Social Media")
        assertThat(job.description).contains("online strategy")
        assertThat(job.perks).hasSize(8).contains("Free coffee / tea: Get your caffeine fix for free")
    }
}