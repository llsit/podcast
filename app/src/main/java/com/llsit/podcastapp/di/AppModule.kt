package com.llsit.podcastapp.di

import com.llsit.player.di.playerModule

val appModule = listOf(
    mainModule
).plus(playerModule)