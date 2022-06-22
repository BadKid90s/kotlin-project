package com.wry.kt.s6


//TODO kotlin 超类上定义扩展函数
//内置函数进行扩展，如果重复定义，属于覆盖，而且会优先使用我们定义的
//自己扩展两个类，会编译失败
fun main() {
    A114("ssss").showContent()
    B114("ssss").showContent()
    val num:Int =1
    num.showContent()
}

data class A114(val msg:String)
data class B114(val name:String)

fun Any.showContent() = println("当前类得内容：${this.toString()}")