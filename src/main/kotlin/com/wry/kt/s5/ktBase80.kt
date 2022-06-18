package com.wry.kt.s5


//TODO kotlin 初始化陷阱
fun main() {
    var base80 = KtBase80()
    println(base80.number)
}

class KtBase80 {
    //第一步，申明变量
    var number = 9

    //第二步， 执行init函数
    init {
        number = number.times(number)
    }
}