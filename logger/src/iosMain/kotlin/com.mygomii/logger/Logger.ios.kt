package com.mygomii.logger


actual fun logger(tag: Tag, message: String) {
    println("[${tag.name}] : $message")
}

actual fun initializeLogger() {
}