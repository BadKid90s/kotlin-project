package com.wry.kt.s6


//TODO kotlin 智能类型转换
fun main() {
    var p = Student3("zsa")

    if (p is Student3) {
        (p as Student3).methodStudent()
    }

    p.methodStudent()

}


open class Person3(var name: String) {

    private fun showName() = "人的姓名：$name"

    open fun printInfo() = println(this.showName())

    private fun methodPerson() = println("我是父类的方法")
}

class Student3(name: String) : Person3(name) {

    override fun printInfo() {
        println("我是学生！")
    }

    fun methodStudent() = println("我是子类的方法")
}