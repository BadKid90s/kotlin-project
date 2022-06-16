package com.wry.kt.s3

import kotlin.math.roundToInt


//TODO kotlin apply内置函数
fun main() {
    var str = "hello world"
    //普通方式
    println("字符串的长度：${str.length}")
    println("最后一个字符：${str[str.length - 1]}")
    println("转小写后的：${str.lowercase()}")

    //apply内置函数方式
    //特点：始终返回本身
    str.apply { this.lowercase() }
    println("apply内置函数方式转小写后的：${str.lowercase()}")

    //链式用法
    str.apply {
        println("长度：${this.length}")
    }.apply {
        println("最后一个字符：${this[this.length - 1]}")
    }.apply {
        println("转小写后的：${this.lowercase()}")
    }


}
