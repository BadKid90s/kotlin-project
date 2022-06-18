package com.wry.kt.s5


//TODO kotlin 主构造函数里定义属性
fun main() {
    var base73 = KtBase73("zs", 19, "hhhhh")
    base73.name="ssss"
    //只读变量不能修改
    //base72.age=222

    println(base73.name)
    println(base73.age)
    println(base73.info)



}

//主构造函数,加上变量读写修饰符
class KtBase73(var name: String, val age: Int, var info: String)