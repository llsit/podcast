package com.llsit.podcastapp.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.llsit.podcastapp.navigation.router.HomeToPlayer
import com.llsit.podcastapp.navigation.router.Router

class HomeViewModel(private val router: Router) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    fun navigateToPlayer() {
        router.routeTo(
            HomeToPlayer
        )
    }
}