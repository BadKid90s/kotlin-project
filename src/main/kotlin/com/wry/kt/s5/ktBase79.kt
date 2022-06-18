package com.wry.kt.s5


//TODO kotlin 惰性初始化by lazy
fun main() {
//    //不使用惰性初始化
//    var base = KtBase79()
//    Thread.sleep(5000)
//    println(base.database)

    //使用惰性初始化by lazy
    var base2 = KtBase79()
    println(base2.database2)
}

//主构造函数
class KtBase79 {
    //不使用惰性初始化by lazy
//    var database: String = readSqlDataBaseAction()

    //使用惰性初始化by lazy
    val database2 by lazy { readSqlDataBaseAction() }

    private fun readSqlDataBaseAction(): String {
        println("开始读取数据库数据中")
        println("加载读取数据库数据中")
        println("加载读取数据库数据中")
        println("结束读取数据库数据中")
        return "database data load success"
    }


}