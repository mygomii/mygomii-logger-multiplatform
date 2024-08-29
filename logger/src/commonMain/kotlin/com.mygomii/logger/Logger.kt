package com.mygomii.logger

expect fun initializeLogger()
expect fun logger(tag: Tag, message: String)

enum class Tag {
    DEBUG,
    ERROR,
    WARNING,
    VERBOSE,
    INFORMATION
}