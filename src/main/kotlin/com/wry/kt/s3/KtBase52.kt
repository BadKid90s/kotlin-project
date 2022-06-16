package com.wry.kt.s3


//TODO kotlin run内置函数
fun main() {
    var str = "hello world"
    //具名函数判断长度
    println(str.run(::strLength))
    //匿名函数判断长度
    var result = str.run { this.length }
    println(result)
}

fun strLength(str:String): Int {
   return str.length
}


