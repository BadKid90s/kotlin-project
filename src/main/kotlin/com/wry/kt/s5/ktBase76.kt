package com.wry.kt.s5


//TODO kotlin 初始化块

fun main() {
    var base = KtBase76()
    println(base)
}

//主构造函数
class KtBase76(var name: String = "wry") {
    //不是JAVA的静态代码块 static{}
    //相当于JAVA的代码块 {}
    //初始化块，init代码块
    init {
        println("主构造函数被调用")
    }

    override fun toString(): String {
        return "name:${this.name}"
    }

    //次构造函数必须调用主构造函数
    constructor(name: String, age: Int = 18) : this(name) {
        println("调用次构造函数,$name---$age")
    }
}