package com.wry.kt.s6


//TODO kotlin  zip合并操作
fun main() {
    val nameList = listOf("zs", "ls", "w2")
    val ageList = listOf(18, 20, 30)

    val zip = nameList.zip(ageList)
    println(zip)

    val pair = zip.unzip()
    println(pair)
}
