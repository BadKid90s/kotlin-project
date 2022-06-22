package com.wry.kt.s6


//TODO kotlin 内置函数与扩展函数
fun main() {
    var result: Boolean = "wry".myLet {
        it
        true
    }
    println(result)
}

//扩展内置函数
//private inline fun <I, O> I.myLet(lambda: (I) -> O) = lambda(this)
private inline fun <I, O> I.myLet(lambda: (I) -> O): O {
    return lambda(this)
}

