package ru.sarmatin.template.di.module

import dagger.Module
import dagger.Provides
import ru.sarmatin.template.repository.AccountRepository
import ru.sarmatin.template.repository.AccountRepositoryImpl
import ru.sarmatin.template.repository.AccountSource
import javax.inject.Singleton

/**
 * Created by antonsarmatin
 * Date: 2019-12-13
 * Project: gto-android-judge-kotlin
 */
@Module
class DataModule {

    @Provides
    @Singleton
    fun accountRepository(accountSource: AccountSource): AccountRepository = AccountRepositoryImpl(accountSource)

}