package com.wry.kt.s6


//TODO kotlin 内部类、嵌套类
fun main() {
    //内部类
    Body("is body").Heart().run()
    Body("is body").Kidney().work()

    Body("is body").show()

    //嵌套类
    Outer.Nested().output()
}

//内部类的特点：内部类能访问外部类。
//           外部类能访问内部类。
class Body(_bodyInfo: String) {
    val bodyInfo = _bodyInfo

    fun show() = run {
        this.Heart().run()
        this.Kidney().work()
    }

    //默认情况下：内部类不能访问外部类。必须加inner关键字修饰
    inner class Heart {
        fun run() = println("心中访问身体信息：$bodyInfo")
    }

    inner class Kidney {
        fun work() = println("肾脏访问身体信息：$bodyInfo")
    }
}

//嵌套类
//嵌套类的特点：内部类不能访问外部类。
//           外部类能访问内部类。
class Outer {
    val info = "OK"

    class Nested {
        fun output() = println("info")
    }

    fun show() = Nested().output()
}