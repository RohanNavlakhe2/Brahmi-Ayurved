package com.brahmiayurved.di

import org.koin.core.module.Module
import org.koin.dsl.module

// Repository modules
val repositoryModule = module {

}

// ViewModel modules
val viewModelModule = module {

}

// Platform-specific modules (will be provided by platform implementations)
expect val platformModule: Module

// App modules - combines all modules
val appModules: List<Module> = listOf(
    repositoryModule,
    viewModelModule,
    platformModule
)
