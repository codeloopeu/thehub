package com.softwareberg.base.modules

import com.google.inject.AbstractModule
import com.google.inject.Provides
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import javax.inject.Singleton

class ConfigModule : AbstractModule() {

    override fun configure() {}

    @Singleton
    @Provides
    private fun provideConfig(): Config {
        return ConfigFactory.load()
    }
}
