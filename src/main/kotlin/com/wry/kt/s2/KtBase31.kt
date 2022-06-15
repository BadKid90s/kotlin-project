package com.wry.kt.s2

import java.util.Objects

//TODO 函数内联学习，如果函数有lambda,尽量使用”inline“关键字修饰，使其内联，内部会进行优化，减少函数调用，对象创建
fun main() {
    loginAPI("wry", "123") { msg: String, code: Int ->
        println("登录之后返回的消息：$msg,返回的状态码:$code")
    }
}

//模拟数据库
const val USER_NAME3 = "wry"
const val PASSWORD3 = "123456"

//前端登录API
//使用lambda做参数，需要声明成内联
//如果不声明内联，在调用端，会生成多个对象来完成lambda的调用（会造成性能损耗）
//如果使用内联，相当于C++ 的宏定义，宏替换，会把代码替换到调用处 （没有任何对象的创建，函数的调用）
private inline fun loginAPI3(username: String, password: String, action: (String, Int) -> Unit) {
    if (Objects.isNull(username) || Objects.isNull(password)) {
        TODO("用户名或密码为空")
    }
    if (username.length < 3 || password.length < 3) {
        TODO("用户名或密码不合格")
    }
    //登录成功
    if (webServerAPI3(username, password)) {
        action("success", 200)
    } else {
        action("failed", 500)
    }
}

//服务端API
private fun webServerAPI3(name: String, password: String): Boolean {
    return name == USER_NAME && password == PASSWORD
}


