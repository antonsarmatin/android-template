package ru.sarmatin.template.presentation.ui.main.splash

import ru.sarmatin.template.R
import ru.sarmatin.template.presentation.platform.BaseFragment

class SplashFragment : BaseFragment() {

    override fun layoutId() = R.layout.splash_fragment

    companion object {
        fun newInstance() = SplashFragment()
    }

    private lateinit var viewModel: SplashViewModel


}
