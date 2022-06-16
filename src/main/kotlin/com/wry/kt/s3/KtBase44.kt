package com.wry.kt.s3


//TODO kotlin split函数
fun main() {
    val str = "hello,world"
    val split = str.split(",")
    for (i in split) {
        println(i)
    }

    //解构
    val (v1, v2) = split
    println("$v1,$v2")

    //直接输出集合
    println(split)
}
