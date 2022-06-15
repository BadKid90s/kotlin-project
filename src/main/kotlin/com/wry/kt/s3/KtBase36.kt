package com.wry.kt.s3

import java.util.*

//TODO kotlin 语言的可安全调用操作符号
fun main() {

    var name: String? = "zhangsan"
//    name = null

    //name是可为空类型，可是是null,如果想要使用，必须给出补救措施
    //name.capitalize()

    //正确写法
    name = name?.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(name)

}