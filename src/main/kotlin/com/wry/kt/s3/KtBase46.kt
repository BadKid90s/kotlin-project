package com.wry.kt.s3


//TODO kotlin ==与===比较操作
fun main() {
    // ==  内容的比较  JAVA的equals
    // === 引的比较    JAVA的==
    val str = String("hello,world".toCharArray())
    val str2 = String("hello,world".toCharArray())
    println(str==str2)
    println(str===str2)
}
