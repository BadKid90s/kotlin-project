package com.wry.kt.s4

//TODO kotlin list的遍历
fun main() {
    val list = mutableListOf("asd", "qwe")

    for (s in list) {
        print("\t $s")
    }

    list.forEach{
        print("\t $it")
    }

    list.forEachIndexed { index, it ->
        print("\t  $index --- $it")

    }
}