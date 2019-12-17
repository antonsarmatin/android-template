package ru.sarmatin.template.di.component

import dagger.Component
import ru.sarmatin.template.repository.AccountRepository
import ru.sarmatin.template.repository.AccountSource
import ru.sarmatin.template.di.module.DataModule
import ru.sarmatin.template.di.module.InteractorModule
import ru.sarmatin.template.interactors.account.AccountInteractor
import javax.inject.Singleton

/**
 * Created by antonsarmatin
 * Date: 2019-12-16
 * Project: gto-android-judge-kotlin
 */
@Component(modules = [InteractorModule::class, DataModule::class])
@Singleton
interface CoreComponent {

    fun accountInteractor(): AccountInteractor

    fun accountRepo(): AccountRepository

    fun accountSource(): AccountSource

}