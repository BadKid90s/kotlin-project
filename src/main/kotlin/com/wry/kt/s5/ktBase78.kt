package com.wry.kt.s5



//TODO kotlin 延时初始化lateinit

fun main() {
    var base = KtBase78()
    base.name="sas"
    println(base.name)
}

//主构造函数
class KtBase78() {

    lateinit var name: String


    init {
        println("init代码块打印")
    }


    //次构造函数必须调用主构造函数
    constructor(name: String, age: Int = 18, info: String) : this() {
        println("调用次构造函数,$name---$age---$info")
        this.name = name;
    }
}