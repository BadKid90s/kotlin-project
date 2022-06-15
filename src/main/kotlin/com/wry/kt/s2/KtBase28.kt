package com.wry.kt.s2

//TODO kotlin语言的匿名函数的lambda
fun main() {

    var addAction = { x: Double, y: Double -> x * y }
    println(addAction(1.0, 2.0))
    println(addAction)

    // 返回Any 类型==Object类型
    var weekAction2 = { num: Int ->
        when (num) {
            1 -> "星期一"
            2 -> "星期二"
            3 -> "星期三"
            4 -> "星期四"
            5 -> "星期五"
            6 -> "星期六"
            7 -> "星期日"
            else -> -1
        }
    }
    println(weekAction2(1))
    println(weekAction2(10))
    println(weekAction2)


}


