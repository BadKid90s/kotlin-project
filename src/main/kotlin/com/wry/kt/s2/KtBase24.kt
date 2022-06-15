package com.wry.kt.s2

//TODO kotlin语言的函数类型&隐式返回
fun main() {

    //与下边的方法相等
    //申明
    var methodAction: () -> String
    //实现
    methodAction = {
        "Hello Word"
    }
    //打印
    println(methodAction())
}
/*
fun methodAction(): String {
    return "hello word"
}
 */