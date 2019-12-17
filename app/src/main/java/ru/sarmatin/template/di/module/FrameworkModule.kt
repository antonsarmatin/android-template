package ru.sarmatin.template.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.sarmatin.template.core.constant.BASE_URL
import ru.sarmatin.template.framework.network.api.Api
import ru.sarmatin.template.framework.network.interceptor.AuthTokenRequestInterceptor
import ru.sarmatin.template.framework.preferences.SharedPreferences
import ru.sarmatin.template.framework.preferences.SharedPreferencesImpl
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class FrameworkModule {


    @Named("main")
    @Singleton
    @Provides
    fun provideRetrofitInterfaceMain(): Retrofit {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(1, TimeUnit.MINUTES)
                .build()

        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

    }



    @Singleton
    @Provides
    fun provideMainGetApi(@Named("main") retrofit: Retrofit): Api {
        return retrofit.create(Api::class.java)
    }

    //TODO Other apis if needed


    @Singleton
    @Provides
    fun sharedPreferences(context: Context): SharedPreferences = SharedPreferencesImpl(context)

    @Singleton
    @Provides
    fun authInterceptor(sp: SharedPreferences): AuthTokenRequestInterceptor = AuthTokenRequestInterceptor(sp)

}