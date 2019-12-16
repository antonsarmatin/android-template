package ru.sarmatin.template.di.component

import dagger.Subcomponent
import ru.sarmatin.template.di.module.PresentationModule

@Subcomponent(modules = [PresentationModule::class])
interface MainComponent {

    //inject fragments

}