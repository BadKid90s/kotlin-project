package com.wry.kt.s6


//TODO kotlin 动态参数
fun main() {
}

class KtBase108<T>(vararg objects: T) {

    private val arrays: Array<out T> = objects

}