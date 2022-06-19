package com.wry.kt.s6


//TODO kotlin 运算符重载
fun main() {
    println(DataAddClass(1,1)+DataAddClass(2,2))
}


data class DataAddClass(var num: Int, var num2: Int) {

    //+
    operator fun plus(p1: DataAddClass):Int {
        return (num + p1.num) + (num2 + p1.num2)
    }
//    查看可以重写的运算符
//    operator fun DataAddClass.unaryPlus

}

