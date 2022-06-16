package com.wry.kt.s4

//TODO kotlin 解构语法过滤元素
fun main() {
    val list = mutableListOf("asd", "qwe","zxc")
    val (_,v1, v2) = list
    println(v1)
    println(v2)
}