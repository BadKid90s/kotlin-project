package com.wry.kt.s6


//TODO kotlin 伴生对象
fun main() {
    println(KtBase89.info)
    KtBase89.show()
    //伴生对象只加载一次，
}

//在Kt中没有Java的这种static静态，伴生很大程度和static差不多
class KtBase89 {
    //伴生对象
    companion object {
        val info = "INFO String。。。。"
        fun show() = println(info)
    }
}