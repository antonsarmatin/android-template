package ru.sarmatin.template.di.component

import dagger.Component
import ru.sarmatin.template.di.module.*

@Component(
    modules = [AppModule::class, ViewModelModule::class, InteractorsModule::class, RepositoryModule::class, FrameworkModule::class]
)
interface AppComponent {

    fun createMainComponent(): MainComponent

}