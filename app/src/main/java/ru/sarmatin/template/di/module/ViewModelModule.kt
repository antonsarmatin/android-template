package ru.sarmatin.template.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.sarmatin.template.di.ViewModelFactory
import ru.sarmatin.template.di.ViewModelKey
import ru.sarmatin.template.presentation.ui.main.splash.SplashViewModel

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory


    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindSplashVM(splashViewModel: SplashViewModel): ViewModel

}