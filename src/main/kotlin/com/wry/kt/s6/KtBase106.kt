package com.wry.kt.s6


//TODO kotlin 范型类型约束
fun main() {

    val any = MyAnyClass("any")
    val per = Person106("person")
    val stu = Student106("student")
    val tea = Teacher106("teacher")
    val dog = Dog106("dog")

    var obj = KtBase106(stu).getObj()

}
//<T : Person106> Person106的子类和Person106类可以使用,相当于Java的extend
//
class KtBase106<T :Person106>(val inputVal: T) {

    fun getObj() = inputVal
}

//顶级父类
open class MyAnyClass(name: String)

//父类
open class Person106(name: String) : MyAnyClass(name)

//子类
class Student106(name: String) : Person106(name)

//子类
class Teacher106(name: String) : Person106(name)

//其他类
class Dog106(name: String)
