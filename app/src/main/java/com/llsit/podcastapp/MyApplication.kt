package com.llsit.podcastapp

import android.app.Application
import com.llsit.podcastapp.di.appModule
import org.koin.core.context.startKoin

open class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }
}