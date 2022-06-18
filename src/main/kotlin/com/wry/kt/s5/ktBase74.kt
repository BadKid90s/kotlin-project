package com.wry.kt.s5


//TODO kotlin 次构造函数实现构造函数重载
//执行顺序
//在次构造函数调用后，先调用主构造函数，再执行次构造函数内部代码
fun main() {

//    var base74 = KtBase74("za", 123)
//    println(base74.name)
//    println(base74.age)
    var base74 = KtBase74("za1")
    println(base74.name)
    println(base74.age)


}

//主构造函数
class KtBase74(var name: String, var age: Int?) {

    //次构造函数必须调用主构造函数
    constructor() : this("", 0)

    //次构造函数必须调用主构造函数
    constructor(name: String) : this(name, 22) {
        println("调用次构造函数,$name---$age")
    }
}