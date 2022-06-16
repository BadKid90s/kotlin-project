package com.wry.kt.s4

//TODO kotlin set创建与元素获取
fun main() {
    val set = setOf("asd", "qwe","zxc")
    println(set.elementAt(0))
    println(set.elementAtOrNull(3))
    println(set.elementAtOrElse(4){"qqqq"})
}