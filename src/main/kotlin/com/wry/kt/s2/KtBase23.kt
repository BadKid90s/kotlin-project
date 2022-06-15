package com.wry.kt.s2

//TODO kotlin 语言的匿名函数学习
fun main() {

    var len = "wry".count()
    println(len)

    val len2 = "wry".count {
        it == 'r'
    }
    println(len2)

}