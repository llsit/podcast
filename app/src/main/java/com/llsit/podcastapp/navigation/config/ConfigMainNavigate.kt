package com.llsit.podcastapp.navigation.config

import androidx.collection.arrayMapOf
import com.llsit.podcastapp.R
import com.llsit.podcastapp.navigation.router.Destination
import com.llsit.podcastapp.navigation.router.HomeToPlayer

object ConfigMainNavigate : Map<Destination, Int> by arrayMapOf(
    HomeToPlayer to R.id.action_homeFragment_to_playerFragment,
)