package com.example.podcastapp.di

import com.example.podcastapp.presentation.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel {
        HomeViewModel()
    }
}