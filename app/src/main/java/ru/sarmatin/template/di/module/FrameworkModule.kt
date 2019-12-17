package ru.sarmatin.template.di.module

import dagger.Module
import dagger.Provides
import ru.gto.gtoadmin.framework.source.AccountSourceNetwork
import ru.sarmatin.template.di.CoreScope
import ru.sarmatin.template.repository.AccountSource

@Module
class FrameworkModule {

    @Provides
    @CoreScope
    fun accountSourceNetwork(): AccountSource = AccountSourceNetwork()

}