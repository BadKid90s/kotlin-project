package com.wry.kt.s4


//TODO kotlin 可变Map
fun main() {
    val map = mutableMapOf("qw" to (1), "ls" to (2))

    map.put("we", 123)
    map["wer"] = 123
    map += "aa" to 1
    map += Pair("zss", 12)
    map -="aa"

    println(map)

    println(map.getOrPut("bbb"){888})
    println(map)
    println(map.getOrPut("bbb"){999})
    println(map)
}