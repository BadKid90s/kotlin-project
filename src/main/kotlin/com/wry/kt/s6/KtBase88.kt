package com.wry.kt.s6


//TODO kotlin 对象表达式，类似与java的匿名类
fun main() {
    //匿名对象表达式
    var base = object : KtBase88() {
        override fun add(info: String) {

            super.add("重写：$info")
        }

        override fun del(info: String) {
            super.del("重写：$info")
        }
    }
    base.add("hhhhhh")
    base.del("hhhhhh")

    //具名对象表达式
    val impl = KtBase88Impl()
    impl.add("2222222")
    impl.del("222222222")

    //对JAVA的接口，用对象表达式方式
    var run = object : Runnable {
        override fun run() {
            println("run run run.....")
        }
    }
    run.run()

    //对JAVA的接口，最简洁的方式
    var run2 = Runnable {
        println("run run run.....")
    }
    run2.run()
}

open class KtBase88 {
    open fun add(info: String) = println("add: $info")
    open fun del(info: String) = println("del: $info")
}

class KtBase88Impl : KtBase88() {
    override fun add(info: String) {

        super.add("重写：$info")
    }

    override fun del(info: String) {
        super.del("重写：$info")
    }
}