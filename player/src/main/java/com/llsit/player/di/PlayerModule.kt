package com.llsit.player.di

import com.llsit.player.PlayerViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val playerModule = module {

    scope<PlayerViewModel> {
//        scoped<Router> { ReadMainRouter() }

        viewModel {
            PlayerViewModel()
        }
    }
}