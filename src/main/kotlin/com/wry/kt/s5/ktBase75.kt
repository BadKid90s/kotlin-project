package com.wry.kt.s5


//TODO kotlin 构造函数默认值
//执行顺序
//在次构造函数调用后，先调用主构造函数，再执行次构造函数内部代码
fun main() {

//
//    var base = KtBase75("za1", 20)
//    println(base.name)
//    println(base.age)

    //优先调用主构造函数
    var base75 = KtBase75()
    println(base75.name)
    println(base75.age)
}

//主构造函数
class KtBase75(var name: String = "wry") {

    var age: Int = 0

    //次构造函数必须调用主构造函数
    constructor(name: String, age: Int = 18) : this(name) {
        println("调用次构造函数,$name---$age")
        this.age = age
    }
}