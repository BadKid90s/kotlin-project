package com.wry.kt.s4

import java.io.File

//TODO kotlin 数组
fun main() {
//IntArray           intArrayOf
//DoubleArray        doubleArrayOf
//FloatArray         floatArrayOf
//IntArray           intArrayOf
//LongArray          longArrayOf
//ShotArray          shotArrayOf
//ByteArray          byteArrayOf
//BooleanArray       booleanArrayOf
//Array              arrayOf

    val intArray= intArrayOf(1,2,3)
    println(intArray.get(0))
    println(intArray[0])

    println(intArray.elementAtOrElse(99){-1})
    println(intArray.elementAtOrNull(99))

    var list = intArray.toList()
    println(list[0])

    var files = arrayOf(File("a"), File("b"))


}