package com.wry.kt.s3


//TODO kotlin 异常处理与自定义异常
fun main() {

    try {
        var info: String? = null

        checkException(info)

        println(info!!.length)
    } catch (e: java.lang.Exception) {
        println("捕获到异常：$e")
    }
}

fun <T : Any> checkException(value: T?): T {
    if (value == null) {
        throw IllegalArgumentException()
    } else {
        return value
    }
}

class CustomException : IllegalArgumentException("代码不太严谨")