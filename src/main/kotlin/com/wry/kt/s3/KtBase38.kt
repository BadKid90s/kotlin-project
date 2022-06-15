package com.wry.kt.s3


//TODO kotlin 中的断言操作符“!!”
fun main() {

    var name: String? = null

    name="sz"
    var s = name!!.capitalize()
    println(s)

}