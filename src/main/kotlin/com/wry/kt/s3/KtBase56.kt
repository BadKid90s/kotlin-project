package com.wry.kt.s3


//TODO kotlin takeUnless内置函数
fun main() {
//    takeUnless内置函数与takeIf功能相反
    println("123".takeUnless { it.length > 3 })
    println("123".takeUnless { it.length <= 3 })

}

