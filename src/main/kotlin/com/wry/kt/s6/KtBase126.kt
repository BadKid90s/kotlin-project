package com.wry.kt.s6


//TODO kotlin  filter操作
fun main() {
    val list = listOf(
        Info("zs1", 18),
        Info("ls1", 20),
        Info("ww1", 166)
    )

    val list2 = list.filter { it.age>18 }
    println(list2)
}
