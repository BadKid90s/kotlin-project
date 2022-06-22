package com.wry.kt.s6


//TODO kotlin 扩展函数
fun main() {
    var base113 = KtBase113("zs", 20)
    println(base113.info())

    println("字符串".info())
    "xxx".isBlank()

}

class KtBase113(val name: String, val age: Int)


fun KtBase113.info(): String {
    return "姓名： ${this.name} 年龄： ${this.age}"
}

fun String.info(): String {
    return "info :$this"
}