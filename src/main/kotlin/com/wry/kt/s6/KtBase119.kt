package com.wry.kt.s6


//TODO kotlin infix关键字
//infix 中缀表达式
fun main() {

    var map = mapOf("zs" to 1)
    println(123 myTo "hahaha")
    /*
     * Creates a tuple of type [Pair] from this and [that].
     *
     * This can be useful for creating [Map] literals with less noise, for example:
     * @sample samples.collections.Maps.Instantiation.mapFromPairs
       public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
     */
}

//自定义中缀表达式
private infix fun <I1, I2> I1.myTo(i2: I2): String {
    println("自定义中缀表达式：$this----$i2")
    return "$this --${i2.toString()}"
}