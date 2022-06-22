package com.wry.kt.s6


//TODO kotlin 泛型扩展函数
fun main() {
    "2131".showContentInfo()
    345.showContentInfo()
    false.showContentInfo()

    println("2131".showTypesAction())
    println(345.showTypesAction())
    println(false.showTypesAction())
}

fun <T> T.showContentInfo(): String {
    if (this is String) {
        return "你的字符串长度是${this.length}"
    }
    return "不是字符串，内容是：$this"
}

fun <INPUT> INPUT.showTypesAction(): String {
    return when (this) {
        is String -> "String类型"
        is Int -> "Int类型"
        is Double -> "Double类型"
        is Boolean -> "Boolean类型"
        else -> "其他类型"
    }
}