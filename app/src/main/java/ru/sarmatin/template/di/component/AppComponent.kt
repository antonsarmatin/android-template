package ru.sarmatin.template.di.component

import dagger.Component
import ru.sarmatin.template.di.module.*

@Component(
        modules = [AppModule::class, ViewModelModule::class, FrameworkModule::class, PresentationModule::class],
        dependencies = [CoreComponent::class]
)
interface AppComponent {

    fun createMainComponent(): MainComponent

}