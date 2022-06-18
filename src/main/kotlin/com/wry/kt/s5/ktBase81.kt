package com.wry.kt.s5


//TODO kotlin 初始化陷阱
fun main() {
    var base80 = KtBase80()
    println(base80.number)
}

class KtBase81 {
    //第一步，申明变量
    var info: String

    //第二步， 执行init函数
    init {
        //第三步，执行方法
        getInfoMethod()
        //第五步，赋值
        info = "Hello world"
    }

    private fun getInfoMethod() {
        //第四步，info没有赋值，报错
        println("Info : $info[0]")
    }
}