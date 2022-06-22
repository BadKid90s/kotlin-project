package com.wry.kt.s6


//TODO kotlin 扩展文件
fun main() {

    var list = listOf("zs", "ls", "ww")

    var set = setOf(1, 2, 4)


    println(list.randomItem())
    println(set.randomItem())
}

//1.扩展文件一般都是public修饰
fun <E> Iterable<E>.randomItem() = this.shuffled().first()
