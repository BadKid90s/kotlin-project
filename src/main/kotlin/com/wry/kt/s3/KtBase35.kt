package com.wry.kt.s3

//TODO kotlin 语言的可为空特点
fun main() {
    //第一种情况：默认是不可为空类型，不能随意赋值null
    var name = "zs"
    //提示：不能是非空类型
    //name = null

    //第二种情况：声明时，指定为可空类型
    var name2: String?
    name2 = null
    println(name2)

}