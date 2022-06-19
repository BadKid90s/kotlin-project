package com.wry.kt.s6


//TODO kotlin 枚举类定义函数
fun main() {
//显示枚举值
    Limbs.LEFT_HAND.limbsInfo.show()
    Limbs.RIGHT_HAND.limbsInfo.show()
}

enum class Limbs(val limbsInfo: LimbsInfo) {
    LEFT_HAND(LimbsInfo("左手", 120)),
    RIGHT_HAND(LimbsInfo("右手", 120)),

    LEFT_FOOT(LimbsInfo("左脚", 110)),
    RIGHT_FOOT(LimbsInfo("左脚", 100)),
}

class LimbsInfo(val limbsInfo: String, val length: Int) {
    fun show() {
        println("${limbsInfo}的长度是$length")
    }
}

