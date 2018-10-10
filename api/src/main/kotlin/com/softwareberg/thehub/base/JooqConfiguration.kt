package com.softwareberg.thehub.base

import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class JooqConfiguration {

    @Bean
    fun jooqDatabase(dataSource: DataSource): DSLContext {
        return DSL.using(dataSource, SQLDialect.POSTGRES_10)
    }
}
