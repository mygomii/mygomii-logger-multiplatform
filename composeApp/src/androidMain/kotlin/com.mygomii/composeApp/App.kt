package com.mygomii.composeApp

import android.app.Application
import com.mygomii.logger.initializeLogger

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initializeLogger()
    }
}