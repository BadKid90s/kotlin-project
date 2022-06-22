package com.wry.kt.s6


//TODO kotlin 泛型函数
fun main() {

    println(KtBase104(true, "zs").getObj())
    println(KtBase104(false, "zs").getObj() ?: "返回的是null")

}

//万能输出器
class KtBase104<T>(private val isReturn: Boolean, private val obj: T) {
    fun show() = println("万能输出器：$obj")

    fun getObj(): T? = obj.takeIf { isReturn }
}


fun <T> show(item: T): T {
    return item;
}