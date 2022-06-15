package com.wry.kt.s3

import java.util.*

//TODO kotlin 中使用带let的安全调用
fun main() {

    var name: String? = null
    name="we"

    //name是可空类型，如果是null,？后面的代码不执行，就不会引发空指针
    name = name?.let { "hhhhh" }
    println(name)

}