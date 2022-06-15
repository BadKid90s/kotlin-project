package com.wry.kt.s2

import java.util.Objects

//TODO 在函数中定义的参数简写
fun main() {
    //第一种方法
    loginAPI("wry", "123", { msg: String, code: Int ->
        println("登录之后返回的消息：$msg,返回的状态码:$code")
    })
    //第二种方法
    loginAPI("wry", "123", action = { msg: String, code: Int ->
        println("登录之后返回的消息：$msg,返回的状态码:$code")
    })

    //第三种方法
    loginAPI("wry", "123") { msg: String, code: Int ->
        println("登录之后返回的消息：$msg,返回的状态码:$code")
    }

}

//模拟数据库
const val USER_NAME2 = "wry"
const val PASSWORD2 = "123456"

//前端登录API
fun loginAPI2(username: String, password: String, action: (String, Int) -> Unit) {
    if (Objects.isNull(username) || Objects.isNull(password)) {
        TODO("用户名或密码为空")
    }
    if (username.length < 3 || password.length < 3) {
        TODO("用户名或密码不合格")
    }
    //登录成功
    if (webServerAPI2(username, password)) {
        action("success", 200)
    } else {
        action("failed", 500)
    }
}

//服务端API
private fun webServerAPI2(name: String, password: String): Boolean {
    return name == USER_NAME && password == PASSWORD
}


