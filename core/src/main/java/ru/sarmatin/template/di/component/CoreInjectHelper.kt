package ru.sarmatin.template.di.component


/**
 * Created by antonsarmatin
 * Date: 2019-12-16
 * Project: gto-android-judge-kotlin
 */
object CoreInjectHelper {

    fun provideCoreComponent(provider: CoreComponentProvider): CoreComponent {
        return provider.provideCoreComponent()
    }

}