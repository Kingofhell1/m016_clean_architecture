package com.example.m016_clean_architecture.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.m016_clean_architecture.data.State
import com.example.m016_clean_architecture.databinding.FragmentMainBinding
import com.example.m016_clean_architecture.di.DaggerAppComponent
import kotlinx.coroutines.launch



class MainFragment : Fragment() {


    private lateinit var binding: FragmentMainBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels {
        DaggerAppComponent.create().mainViewModelFactory()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)

        binding.refreshButton.setOnClickListener {
            viewLifecycleOwner.lifecycleScope.launch {
                viewModel.reloadUsefulActivity()
                viewModel.activityFlow.collect {state ->
                    when(state) {
                        is State.Failure -> binding.usefulActivity.text = state.value
                        is State.Success -> binding.usefulActivity.text = state.value
                        null -> ""
                    }
                }
            }
        }
        return binding.root
    }


}