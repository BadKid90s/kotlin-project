package com.wry.dsl.lambda

/**
 * 函数式接口，使用`fun`修饰接口
 */
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

/**
 * 使用函数式接口
 */
fun getResult(num: Int, action: IntPredicate): Boolean {
    return action.accept(num)
}


fun main(args: Array<String>) {

    //原始写法
    val res1 = getResult(10, (object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }))
    //简洁写法
    val res2 = getResult(7, IntPredicate { it % 2 == 0 })

    //更简化
    val res3 = getResult(7, { it % 2 == 0 })

    //终结版
    val res4 = getResult(7) {
        it % 2 == 0
    }

    listOf("").map { it }.forEach { true }.toString()

}