package com.wry.kt.s4
//TODO kotlin 可变List创建与元素获取
fun main(){
    //可变集合创建
    val list = mutableListOf("zs", "ls")
    //取值
    println(list.get(1))
    println(list[0])
    println(list.getOrElse(2){"213"})
    println(list.getOrNull(2))
    list.add("asd")
    println(list.getOrNull(2))

    //不可变集合
    val list2= listOf("qwe")

    //相互转换
    val mutableList = list2.toMutableList()
    mutableList.add("adas")
    println(mutableList.get(1))


    val toList = mutableList.toList()
    println(toList.get(1))


    var array = list.toTypedArray()
    println(array)
}