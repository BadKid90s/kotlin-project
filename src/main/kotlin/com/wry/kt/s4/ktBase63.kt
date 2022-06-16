package com.wry.kt.s4

//TODO kotlin 可变set创建与元素获取
fun main() {
    val set = mutableSetOf("asd", "qwe","zxc")
    set.add("123")
    println(set.elementAt(0))
    println(set.elementAtOrNull(3))
    println(set.elementAtOrElse(4){"qqqq"})

    var toSet = set.toSet()
    println(toSet)


    var strings = setOf("123")
    println(strings)

    var mutableSet = strings.toMutableSet()
    mutableSet.add("234")
    println(mutableSet)


}