package com.wry.kt.s4
//TODO kotlin List创建与元素获取
fun main(){
    //创建
    var list = listOf("zs", "ls")
    //取值
    println(list.get(1))
    println(list[0])
    println(list.getOrElse(2){"213"})
    println(list.getOrNull(2))

}