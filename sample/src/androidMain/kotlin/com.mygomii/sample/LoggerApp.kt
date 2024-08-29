package com.mygomii.sample

import android.app.Application
import com.mygomii.logger.initializeLogger

class LoggerApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initializeLogger()
    }
}