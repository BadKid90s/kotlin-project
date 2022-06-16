package com.wry.kt.s3


//TODO kotlin with内置函数
fun main() {
    var str = "hello world"

    //具名函数
    with(str,::println)

    //匿名函数
    with(str){
        println(this)
    }
}

