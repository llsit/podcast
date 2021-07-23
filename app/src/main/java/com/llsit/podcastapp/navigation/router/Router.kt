package com.llsit.podcastapp.navigation.router

import android.os.Bundle
import androidx.navigation.NavController

abstract class Router {
    var crossRouter: CrossRouter? = null
    var navController: NavController? = null
    var latestRoute: Destination? = null

    open fun routeTo(destination: Destination, bundle: Bundle? = null) {
        latestRoute = destination
    }
}