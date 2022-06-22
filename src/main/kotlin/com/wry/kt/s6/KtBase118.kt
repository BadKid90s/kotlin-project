package com.wry.kt.s6


//TODO kotlin 可空类型函数扩展
fun main() {
    val infoVal: String? = null
    //可接受可空数据，或者非空数据
    infoVal.outputValue("default")

    val infoVal2: String? = "null"
    //可接受可空数据，或者非空数据
    infoVal2.outputValue("default")
}

fun String?.outputValue(defaultValues: String) = println(this ?: defaultValues)