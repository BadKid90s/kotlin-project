package com.wry.kt.s5


//TODO kotlin 主构造函数
fun main() {
    var base72 = KtBase72("zs", 19,"hhhhh")
    println(base72.name)
    println(base72.age)
    println(base72.info)

}

//主构造函数：规范化，都是增加下划线的方式

class KtBase72(_name: String, _age: Int, _info: String) {
    /*构造器的入参，都是临时的输入类型，不能直接使用，需要接收下
       fun show(){
           println(_name)
       }
     */
    //接收，set,get方法默认是public修饰的，
    var name = _name
        set(value) {
            field = value
        }
        get() = field

    val age: Int = _age
        get() {
            return field
        }
    var info: String = _info
}