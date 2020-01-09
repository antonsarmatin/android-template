package ru.sarmatin.template.presentation.ui.main.splash

import android.os.Bundle
import androidx.lifecycle.LiveData
import ru.sarmatin.template.R
import ru.sarmatin.template.core.exception.Failure
import ru.sarmatin.template.presentation.extension.viewModel
import ru.sarmatin.template.presentation.platform.BaseFragment

class SplashFragment : BaseFragment() {

    override fun layoutId() = R.layout.splash_fragment

    override fun handleFailure(): LiveData<Failure>? = viewModel.failure

    companion object {
        fun newInstance() = SplashFragment()
    }

    private lateinit var viewModel: SplashViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.createMainComponent().injectSplashFragment(this)
        viewModel = viewModel(viewModelFactory)
    }

}
