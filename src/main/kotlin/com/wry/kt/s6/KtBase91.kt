package com.wry.kt.s6


//TODO kotlin 数据类
fun main() {
    var respResult = RespResult(200, "success", "登录成功！")
    println(respResult)

    var dataResult = DataRespResult(200, "success", "登录成功！")
    //重新父类的toString函数
    println(dataResult)

    println()

    //普通类==比较的是对象引用，equals函数默认比较的是对象引用
    println(RespResult(200, "success", "登录成功！") == RespResult(200, "success", "登录成功！"))
    //数据类==比较的是值，重写equals函数，比较的是对象的值
    println(DataRespResult(200, "success", "登录成功！") == DataRespResult(200, "success", "登录成功！"))

    //结构
    val (code, msg, data) = dataResult
    println("code : $code")
    println("msg : $msg")
    println("data : $data")
}

//普通类
//set方法，get方法，构造函数
class RespResult(var code: Int, var msg: String, var data: Any)

//数据类
//set方法，get方法，构造函数，copy函数，toString函数，hashCode函数，equals函数、结构函数
data class DataRespResult(var code: Int, var msg: String, var data: Any)
