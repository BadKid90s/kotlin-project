package com.wry.kt.s6


//TODO kotlin 枚举
fun main() {
    println(Week.ONE)
    println(Week.ONE is Week)
}

enum class Week{
    ONE,
    TWO,
    THREAD,
    FOUR
}