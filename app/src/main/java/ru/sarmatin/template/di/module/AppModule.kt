package ru.sarmatin.template.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.sarmatin.template.di.CoreScope
import javax.inject.Singleton

@Module
class AppModule(private val context: Context) {

    @CoreScope
    @Provides
    fun provideContext(): Context = context

}
