package com.ericho.example

import androidx.multidex.MultiDexApplication
import com.facebook.stetho.Stetho
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        startKoin {
            androidLogger()
            // Android context
            androidContext(this@App)
            // modules
            modules(appMainModule)
        }
//        Timber.plant(Timber.DebugTree())
    }
}