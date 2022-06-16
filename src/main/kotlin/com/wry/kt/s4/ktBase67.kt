package com.wry.kt.s4

import java.io.File

//TODO kotlin Map读取
fun main() {
    val map = mapOf("qw" to(1),"ls" to(2))

    println(map.get("qw"))
    println(map["qw"])
    println(map.getOrElse("wq") { "-----" })
    println(map.getOrDefault("wq","qwe"))



}