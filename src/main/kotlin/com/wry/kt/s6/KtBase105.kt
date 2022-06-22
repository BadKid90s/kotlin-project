package com.wry.kt.s6


//TODO kotlin 泛型变换
fun main() {

    println(KtBase105("1").map { "【$it】" })
    println(KtBase105("1").map { it.toInt() })
    println(KtBase105("1").map { KtBase105(it)})
}

class KtBase105<T>(private val inputType: T) {

    fun <R> map(mapAction: (T) -> R) = mapAction(inputType)
}