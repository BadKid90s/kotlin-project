package com.wry.kt.s2



//TODO Kotlin 匿名函数和具名函数
fun main() {
    //匿名函数
    showPersonInfo("wry", 20) {
        println("result: $it")
    }
    //具名函数
    showPersonInfo("wry", 20, ::showResultImpl)

}

private fun showResultImpl(str: String) {
    println("result: $str")
}

private inline fun showPersonInfo(name: String, age: Int, showResult: (String) -> Unit) {
    val str = "name:$name,age:$age"
    showResult(str);
}