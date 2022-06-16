package com.wry.kt.s4

//TODO kotlin 集合转换与快捷函数
fun main() {
    val set = mutableSetOf("asd", "qwe","zxc")

    var list = set.toMutableList()
    list.add("qwe")

    val distinct = list.distinct()
    println(distinct)

}