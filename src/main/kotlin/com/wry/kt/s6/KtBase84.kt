package com.wry.kt.s6

import java.io.File

//TODO kotlin 类型转换学习
fun main() {

    val p: Person2 = Student2("zs")

    //is 进行类型判断
    println(p is Student2)
    println(p is Person2)
    //as 进行类型转换
    if (p is Student2){
        (p as Student2).printInfo()
    }

    if (p is Person2){
        (p as Person2).printInfo()
    }


}

//Kt默认所有的类都是被final修饰的，必须加关键字open才能被继承，方法也是一样
//open的作用是移除类或属性上的final关键字
open class Person2(var name: String) {

    private fun showName() = "人的姓名：$name"

    open fun printInfo() = println(this.showName())
}

class Student2(name: String) : Person2(name) {

    override fun printInfo() {
        println("我是学生！")
    }
}