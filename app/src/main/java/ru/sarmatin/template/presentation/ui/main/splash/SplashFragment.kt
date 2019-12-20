package ru.sarmatin.template.presentation.ui.main.splash

import androidx.lifecycle.LiveData
import ru.sarmatin.template.R
import ru.sarmatin.template.core.exception.Failure
import ru.sarmatin.template.presentation.platform.BaseFragment

class SplashFragment : BaseFragment() {

    override fun layoutId() = R.layout.splash_fragment

    override fun handleFailure(): LiveData<Failure>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        fun newInstance() = SplashFragment()
    }

    private lateinit var viewModel: SplashViewModel


}
