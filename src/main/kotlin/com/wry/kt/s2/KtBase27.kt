package com.wry.kt.s2

//TODO kotlin语言的匿名函数的类型推断
fun main() {

    //匿名函数类型推断为String
    //方法名：必须指定 入参类型 -> 返回值类型
    //方法名= 类型推断返回类型
    var methodAction2 = { x: Double, y: Double -> x * y }
    println(methodAction2(1.0, 2.0))
    println(methodAction2)


    var methodAction3 = { x: Double, y: Double -> (x * y).toString() + "" }
    println(methodAction3(1.0, 2.0))
    println(methodAction3)


}


