package com.wry.kt.s3


//TODO kotlin 数字类型的安全转换函数
fun main() {

    val number = "666666"
    println(number.toInt())

    val number2:Int = "666666".toInt()
    println(number2)

    val number3:Int? = "66666.6".toIntOrNull()
    println(number3)
}
