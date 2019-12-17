package ru.sarmatin.template

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import ru.sarmatin.template.di.component.AppComponent
import ru.sarmatin.template.di.component.CoreComponent
import ru.sarmatin.template.di.component.CoreComponentProvider
import ru.sarmatin.template.di.component.DaggerAppComponent
import ru.sarmatin.template.di.module.AppModule

class App : Application(), CoreComponentProvider {

    val appComponent: AppComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    private lateinit var coreComponent: CoreComponent

    override fun onCreate() {
        super.onCreate()

        AndroidThreeTen.init(this)

    }

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                    .builder()
                    .build()
        }
        return coreComponent
    }

}