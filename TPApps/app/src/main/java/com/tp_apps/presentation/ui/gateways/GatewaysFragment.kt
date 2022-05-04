package com.tp_apps.presentation.ui.gateways

import android.viewbinding.library.fragment.viewBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tp_apps.databinding.FragmentGatewaysBinding

class GatewaysFragment : Fragment() {

    private val binding: FragmentGatewaysBinding by viewBinding()
    private val viewModel: GatewaysViewModel by viewModels()

}