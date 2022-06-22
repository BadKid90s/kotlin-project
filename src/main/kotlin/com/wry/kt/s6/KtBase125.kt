package com.wry.kt.s6


//TODO kotlin  flatmap操作
fun main() {
    val list = listOf(
        Info("zs1", 18),
        Info("ls1", 20),
        Info("ww1", 166)
    )

    val list2 = listOf(
        Info("zs2", 18),
        Info("ls2", 20),
        Info("ww2", 166)
    )

    //查询年龄小于25岁的人姓名
    val nameList = listOf(list, list2).flatMap { it }.filter { it.age < 25 }.map { it.name }
    val nameList2 = listOf(list, list2).flatten() .filter { it.age < 25 }.map { it.name }

    println(nameList)
    println(nameList2)
}
