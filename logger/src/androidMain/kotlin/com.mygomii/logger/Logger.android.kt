package com.mygomii.logger

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger

actual fun initializeLogger() {
    Logger.addLogAdapter(object : AndroidLogAdapter() {
        override fun isLoggable(priority: Int, tag: String?): Boolean {
//                return BuildConfig.DEBUG // TODO;
            return true
        }
    })
}

actual fun logger(tag: Tag, message: String) {
    when (tag) {
        Tag.DEBUG -> Logger.d(message)
        Tag.ERROR -> Logger.e(message)
        Tag.WARNING -> Logger.w(message)
        Tag.VERBOSE -> Logger.v(message)
        Tag.INFORMATION -> Logger.i(message)
    }
}

