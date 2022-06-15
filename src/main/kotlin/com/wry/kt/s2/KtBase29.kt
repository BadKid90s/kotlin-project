package com.wry.kt.s2

import java.util.Objects

//TODO 在函数中定义的参数是函数的函数
fun main() {
    loginAPI("wry", "123") { msg: String, code: Int ->
        println("登录之后返回的消息：$msg,返回的状态码:$code")
    }

}

//模拟数据库
const val USER_NAME = "wry"
const val PASSWORD = "123456"

//前端登录API
fun loginAPI(username: String, password: String, action: (String, Int) -> Unit) {
    if (Objects.isNull(username) || Objects.isNull(password)) {
        TODO("用户名或密码为空")
    }
    if (username.length < 3 || password.length < 3) {
        TODO("用户名或密码不合格")
    }
    //登录成功
    if (webServerAPI(username, password)) {
        action("success", 200)
    } else {
        action("failed", 500)
    }
}

//服务端API
private fun webServerAPI(name: String, password: String): Boolean {
    return name == USER_NAME && password == PASSWORD
}


