package uz.tatunf.programming

import android.app.Application
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import uz.tatunf.programming.di.adapterModule
import uz.tatunf.programming.di.dataModule
import uz.tatunf.programming.di.viewModelModule

class App: Application() {
    private val settings: Settings by inject()

    override fun onCreate() {
        super.onCreate()
        val modules = listOf(dataModule, viewModelModule, adapterModule)
        startKoin { // use AndroidLogger as Koin Logger - default Level.INFO
            androidLogger()
            // use the Android context given there
            androidContext(this@App)
            // load properties from assets/koin.properties file
            androidFileProperties()
            // module list
            modules(modules)
        }
    }
}