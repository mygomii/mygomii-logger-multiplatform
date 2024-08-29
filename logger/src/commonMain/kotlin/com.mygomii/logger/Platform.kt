package com.mygomii.logger

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform


