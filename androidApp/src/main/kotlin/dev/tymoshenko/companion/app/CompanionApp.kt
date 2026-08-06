package dev.tymoshenko.companion.app

import android.app.Application
import dev.tymoshenko.companion.app.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class CompanionApp : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@CompanionApp)
            androidLogger()
        }
    }
}