package com.wry.kt.s2

import java.util.*


//TODO Kotlin 函数类型作为返回类型
fun main() {
    println(showAction()(20, 180.0))
}


private fun showAction(): (Int, Double) -> String {
    val name = "zs"
    val year = 2022
    return { age: Int, height: Double ->
        "我的名字是:$name,${year}年,我的年龄是：$age,我的身高是：${height}"
    }
}