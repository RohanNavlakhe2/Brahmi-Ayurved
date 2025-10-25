package com.brahmiayurved.di

import org.koin.core.module.Module
import org.koin.dsl.module

// iOS-specific modules
actual val platformModule: Module = module {
    // Add iOS-specific dependencies here if needed
    // For example, iOS-specific repositories, services, etc.
}
