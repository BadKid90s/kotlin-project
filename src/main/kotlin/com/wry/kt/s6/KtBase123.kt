package com.wry.kt.s6


//TODO kotlin  DSL
//DSL简介：所谓的DSL领域专用语言（domain specified language）
fun main() {
    var context = Context().apply5 {
        toast("success")
        toast(it)
        toast(info)
    }
    println(context)
}

class Context {
    val info = "context"

    fun toast(str: String) {
        println("toast: $str")
    }
}

inline fun Context.apply5(lambda: Context.(String) -> Unit): Context {
    this.lambda(info)
    return this
}