package com.wry.kt.s3

import kotlin.math.roundToInt


//TODO kotlin let内置函数
fun main() {
    val list = listOf(1, 2, 3, 4)
    //普通方式 对集合第一个元素相加
    val first = list.first()
    val result = first + first
    println(result)

    //let方式 对集合第一个元素相加
    var result2 = list.let { it.first() + it.first() }
    println(result2)

}
