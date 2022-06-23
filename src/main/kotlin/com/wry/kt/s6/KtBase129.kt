package com.wry.kt.s6


//TODO kotlin  互操作性与可空性
fun main() {

    //kt　与　java代码交互，错误示例
    val base129 = KtBase129()
    // val name:String! = base129.name
//    val name1 = base129.name
//    println(name1)

    //kt　与　java代码交互，正确示例
    val base1291 = KtBase129()
    val name: String? = base1291.name
    val age: Int? = base1291.age
    println(name ?: "")
    println(age ?: 0)

}
