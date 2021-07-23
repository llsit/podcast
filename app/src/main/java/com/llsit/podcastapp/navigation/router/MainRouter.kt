package com.llsit.podcastapp.navigation.router

import android.os.Bundle
import com.llsit.podcastapp.navigation.config.ConfigMainNavigate

class MainRouter : Router() {
    override fun routeTo(destination: Destination, bundle: Bundle?) {
        super.routeTo(destination, bundle)
        val navigationId = ConfigMainNavigate[destination]
        navigationId?.let { _navigationId ->
            navController?.navigate(_navigationId, bundle)
        } ?: run {
            when (destination) {
                // do nothing
                else -> {
                }
            }
        }
    }
}