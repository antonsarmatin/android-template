package ru.sarmatin.template.di.module

import dagger.Module
import dagger.Provides
import ru.sarmatin.template.repository.AccountRepository
import ru.sarmatin.template.interactors.account.AccountInteractor
import ru.sarmatin.template.interactors.account.AccountInteractorImpl
import javax.inject.Singleton

/**
 * Created by antonsarmatin
 * Date: 2019-12-13
 * Project: gto-android-judge-kotlin
 */
@Module
class InteractorModule {

    @Provides
    @Singleton
    fun accountInteractor(accountRepository: AccountRepository): AccountInteractor = AccountInteractorImpl(accountRepository)

}