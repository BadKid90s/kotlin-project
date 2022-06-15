package com.wry.kt.s3


//TODO kotlin 中对比使用if判断null值情况
fun main() {

    var name: String? = null

    if (name != null) {
        println(name.capitalize())
    }

}