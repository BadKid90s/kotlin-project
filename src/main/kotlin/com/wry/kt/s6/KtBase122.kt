package com.wry.kt.s6


//TODO kotlin apply函数详解
fun main() {
    var result = "wry".myApply {

        println("hhhhhhhhhhhhhh ---${this.length}")
        "ssss"
    }
    println(result)
}

private inline fun <I> I.myApply(lambda: I.() -> Unit): I {
    this.lambda()
    return this
}