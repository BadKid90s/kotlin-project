package com.wry.kt.s2

//TODO kotlin语言的函数参数
fun main() {


    //申明
    var methodAction: (Int, Int) -> String
    //实现
    methodAction = { x, y ->
        "Hello Word $x-----$y"
    }
    //打印
    println(methodAction(1, 2))


    //申明
    var methodAction2: (Int, Int) -> String = { x, y ->
        "Hello Word $x-----$y"
    }
    //打印
    println(methodAction2(1, 2))
}


