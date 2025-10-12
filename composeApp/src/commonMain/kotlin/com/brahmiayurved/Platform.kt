package com.brahmiayurved

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform