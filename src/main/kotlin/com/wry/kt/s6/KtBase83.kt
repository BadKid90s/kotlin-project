package com.wry.kt.s6

//TODO kotlin 继承与重载的open关键字学习
fun main() {

    val person = Student("zs")
    println(person.name)
    person.printInfo()

}

//Kt默认所有的类都是被final修饰的，必须加关键字open才能被继承，方法也是一样
//open的作用是移除类或属性上的final关键字
open class Person(var name: String) {

    private fun showName() = "人的姓名：$name"

    open fun printInfo() = println(this.showName())
}

class Student(name: String) : Person(name) {

    override fun printInfo() {
        println("我是学生！")
        super.printInfo()
    }
}