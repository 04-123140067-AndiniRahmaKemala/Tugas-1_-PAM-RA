package com.example.myprojectonekmpapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform