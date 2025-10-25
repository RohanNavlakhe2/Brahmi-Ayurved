package com.brahmiayurved.di

import com.brahmiayurved.data.repository.BaseRepository
import com.brahmiayurved.data.repository.FirebaseRepository
import com.brahmiayurved.presentation.ArticlesViewModel
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.firestore.firestore
import org.koin.core.module.Module
import org.koin.dsl.module

// Repository modules
val repositoryModule = module {
    single<BaseRepository> {
        FirebaseRepository(
            firestore = Firebase.firestore
        )
    }
}

// ViewModel modules
val viewModelModule = module {
    factory { ArticlesViewModel(get()) }
}

// Platform-specific modules (will be provided by platform implementations)
expect val platformModule: Module

// App modules - combines all modules
val appModules: List<Module> = listOf(
    repositoryModule,
    viewModelModule,
    platformModule
)
