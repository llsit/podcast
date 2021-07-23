package com.llsit.podcastapp.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.llsit.podcastapp.databinding.FragmentHomeBinding
import com.llsit.podcastapp.navigation.router.CrossRouter
import com.llsit.podcastapp.navigation.router.Router
import org.koin.android.ext.android.inject
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope

class HomeFragment : Fragment() {

    private lateinit var viewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val scope: Scope by lazy { fragmentScope() }
//    private val crossRouter: CrossRouter by inject()
    private lateinit var router: Router

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        initModule()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.mainHeader.setOnClick {
            viewModel.navigateToPlayer()
        }
    }

    private fun initModule() {
        viewModel = scope.get()
        router = scope.get()
        router.navController = findNavController()
//        router.crossRouter = crossRouter
//        crossRouter.activity = requireActivity()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}