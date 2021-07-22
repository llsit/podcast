package com.llsit.podcastapp.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.llsit.podcastapp.databinding.FragmentHomeBinding
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val scope: Scope by lazy { fragmentScope() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        initModule()
        return binding.root
    }

    private fun initModule() {
        homeViewModel = scope.get()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}