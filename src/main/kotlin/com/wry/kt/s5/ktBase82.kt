package com.wry.kt.s5


//TODO kotlin 初始化陷阱
fun main() {
    var base82 = KtBase82("123")
    println(base82.length)
}

class KtBase82(_info: String) {

    val info = _info

    val length: Int = getInfoLength()

    private fun getInfoLength(): Int {
        return this.info.length
    }
}