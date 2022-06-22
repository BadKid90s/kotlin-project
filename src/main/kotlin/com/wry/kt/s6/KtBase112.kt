package com.wry.kt.s6


//TODO kotlin reified关键字
fun main() {
    var randomOrDefault = KtBase112().randomOrDefault {
        Object112_1("default", 1)
    }
    println(randomOrDefault)
}


data class Object112_1(val name: String, val age: Int)
data class Object112_2(val name: String, val age: Int)
data class Object112_3(val name: String, val age: Int)

class KtBase112 {

    //默认随机产生一个对象，如果此对象和用户指定的对象不一致，就启用默认对象
    inline fun <reified T> randomOrDefault(defaultAction: () -> T): T {
        var anyList: List<Any?> = listOf(Object112_1("zs", 18), Object112_2("ls", 19), Object112_3("ww", 20))

        var randomObj: Any? = anyList.shuffled().last()

        println("随机产生得对象是:$randomObj")

//        return randomObj.takeIf { it is T } as T
        return randomObj.takeIf { randomObj is T } as T?
            ?: defaultAction()
    }
}