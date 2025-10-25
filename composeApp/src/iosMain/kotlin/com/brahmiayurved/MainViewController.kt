package com.brahmiayurved

import androidx.compose.ui.window.ComposeUIViewController
import com.brahmiayurved.di.appModules
import org.koin.core.context.startKoin
import org.koin.mp.KoinPlatform.startKoin

fun MainViewController() = ComposeUIViewController { App() }

// Call this from Swift
fun initKoin() {
    startKoin {
        modules(appModules)
    }
}