package com.wry.kt.s5


//TODO kotlin 构造器初始化顺序
//1.main调用次构造函数
//2.次构造器var变量申明
//3.var name = _name
//4.init 代码块打印
//5.次构造器代码块打印
fun main() {
    var base = KtBase77("za", 10, "asda")
    println(base)
}

//主构造函数
class KtBase77(_name: String, var age: Int) {

    var name = _name

    init {
        val nameValue = _name
        println("init代码块打印：nameValue:$nameValue")
    }


    //次构造函数必须调用主构造函数
    constructor(name: String, age: Int = 18, info: String) : this(name, age) {
        println("调用次构造函数,$name---$age---$info")
    }
}