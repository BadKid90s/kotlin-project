package com.wry.kt.s4

//TODO kotlin list็้ๅ
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