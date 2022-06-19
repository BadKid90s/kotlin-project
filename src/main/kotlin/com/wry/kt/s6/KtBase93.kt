package com.wry.kt.s6


//TODO kotlin 解构学习
fun main() {
    var p = KtBase93("za", 12)

    val (name, age) = p
    println(name)
    println(age)
}


//主构造
class KtBase93(var name: String, var age: Int) {

    operator fun component1() = name
    operator fun component2() = age
}
