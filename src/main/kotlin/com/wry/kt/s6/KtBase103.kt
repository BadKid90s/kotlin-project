package com.wry.kt.s6


//TODO kotlin 泛型类
fun main() {
    val s = Student103("zs",19)
    KtBase103(s).show()

    val t = Teacher103("zs",19)
    KtBase103(t).show()
}

//万能输出器
class KtBase103<T>(private val obj: T) {
    fun show() = println("万能输出器：$obj")
}

class Student103(private val name: String,private val age: Int) {

    override fun toString(): String {
        return "姓名：$name 年龄：$age"
    }
}

class Teacher103(private val name: String,private val age: Int) {

    override fun toString(): String {
        return "姓名：$name 年龄：$age 职业老师"
    }
}

