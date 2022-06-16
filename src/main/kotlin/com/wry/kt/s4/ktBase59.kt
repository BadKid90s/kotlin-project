package com.wry.kt.s4

//TODO kotlin mutator函数
fun main() {
    val list = mutableListOf("asd", "qwe")
    list += "李四"
    list += "王五"

    list -= "asd"

    list.removeIf {
        it.length <= 2
    }
    println(list)
}