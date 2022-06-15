package com.wry.kt.s3


//TODO kotlin 中空合并操作符"?:"
fun main() {

    var name: String? = "李小龙"
    name=null

    //如果是null 执行“:”后边的代码
    println(name ?: "原来你是null")

    //let函数+空合并操作符
    println(name?.let { "[$it]" }?:"原来你是null")

}