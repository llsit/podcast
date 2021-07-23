package com.llsit.podcastapp.di

import com.llsit.podcastapp.navigation.router.MainRouter
import com.llsit.podcastapp.navigation.router.Router
import com.llsit.podcastapp.presentation.home.HomeFragment
import com.llsit.podcastapp.presentation.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {

    scope<HomeFragment> {
        scoped<Router> { MainRouter() }

        viewModel {
            HomeViewModel(
                router = get()
            )
        }
    }
}
