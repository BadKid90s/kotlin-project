package com.wry.kt.s3


//TODO kotlin 字符串遍历
fun main() {

    val str = String("hello,world".toCharArray())

    str.forEach {
        print("$it \t")
    }

    println("\n------------")

    for (c in str) {
        print("$c \t")
    }
}
