package com.brahmiayurved.di

import org.koin.core.module.Module
import org.koin.dsl.module

// Android-specific modules
actual val platformModule: Module = module {
    // Add Android-specific dependencies here if needed
    // For example, Android-specific repositories, services, etc.
}
