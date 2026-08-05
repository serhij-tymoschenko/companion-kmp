package dev.tymoshenko.companion

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform