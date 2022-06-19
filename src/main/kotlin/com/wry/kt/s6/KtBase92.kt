package com.wry.kt.s6


//TODO kotlin copy函数学习
fun main() {
    var p = KtBase92("zs")
    var copy = p.copy("llj", 19)

    println(p)
    println(copy)

    //数据类生成的copy、toString、hashCode、equals函数，只管主构造器

}


//主构造
data class KtBase92(var name: String, var age: Int) {
    var coreInfo = ""

    init {
        println("主构造被调用")
    }

    //次构造
    constructor(name: String) : this(name, 0) {
        println("次构造被调用")
        this.coreInfo = "core info ......"
    }

    override fun toString(): String {
        return "name:$name,age:$age，info:$coreInfo"
    }
}
