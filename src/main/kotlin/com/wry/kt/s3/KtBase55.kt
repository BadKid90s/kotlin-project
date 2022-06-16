package com.wry.kt.s3


//TODO kotlin takeIf内置函数
fun main() {
    println(checkPermissionAction("r22t", "123"))

    println("123".takeIf { it.length > 3 })
    println("123".takeIf { it.length <= 3 })
}

fun checkPermissionAction(userName: String, password: String): String? {
    return userName.takeIf { permissionSystem(userName, password) }
}


private fun permissionSystem(userName: String, password: String): Boolean {
    return userName == "root" && password == "123"
}
