package com.wry.kt.s3


//TODO kotlin 先决条件函数
fun main() {

    try {
        var info: String? = null

//        checkNotNull(info)

        requireNotNull(info)

        println(info!!.length)
    } catch (e: java.lang.Exception) {
        println("捕获到异常：$e")
    }
}
