package com.wry.kt.s7

//TODO 注解@JvmStatic与Kotlin
fun main() {
    Obj.showAction("zs")
}

class Obj {
    companion object {
        @JvmField
        val target = "xxxx"

        @JvmStatic
        fun showAction(name: String) = println("$name 去那里${target}玩")
    }
}


