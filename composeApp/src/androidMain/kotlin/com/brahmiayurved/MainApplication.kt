package com.brahmiayurved

import android.app.Application
import com.brahmiayurved.di.appModules
import org.koin.core.context.GlobalContext.startKoin

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModules)
        }
    }
}