package com.wry.kt.s6

import com.wry.kt.s6.randomItem as randomGo //重名名扩展

//TODO kotlin  重名名扩展

fun main() {
    var list = listOf("zs", "ls", "ww")

    var set = setOf(1, 2, 4)


    println(list.randomGo())
}