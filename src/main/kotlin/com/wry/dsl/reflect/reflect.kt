package com.wry.dsl.reflect

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.*
import kotlin.reflect.jvm.isAccessible

/**
 * 定义注解
 */
@Target(
    AnnotationTarget.CLASS
)
annotation class Annot(val name: String = "zs")


@Annot(name = "wry")
@Deprecated("该类已经不推荐使用！")
class ReflectA(val name: String) {

    companion object {
        const val TAG = "ReflectA"
        fun show() {

        }
    }

    var age: Int = 0

    constructor() : this("ReflectA_")

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    fun print(str: String) {
        println("ReflectA print str $str")
    }

    fun sayHi(): String {
        println("ReflectA sayHi")
        return "sayHi"
    }

    class InnerClass

    //对象扩展犯法
    fun ReflectA.exfunShow() = println("show")

    var ReflectA.fooAge: Double
        get() = 6.28
        set(value) {
            value
        }
}

// 类文件拓展方法
private fun ReflectA.exfun() {
    println("exfun")
}

//  类文件拓展属性
private val ReflectA.foo: Double
    get() = 3.14


fun main() {
    //1.通过`类::class`获取Kclass实例
    val kClass1 = ReflectA::class
    //2.通过实例`.javaClass.kotlin`获取Kclass实例
//    val kClass1 = ReflectA("zs").javaClass.kotlin

    //构造函数Constructor
    val constructors = kClass1.constructors
    println("ReflectA 的全部构造器如下：")
    for (constructor in constructors) {
        println(constructor)
    }

    println("ReflectA 的主构造器如下：")
    val primaryConstructor = kClass1.primaryConstructor
    println(primaryConstructor)


    //通过functions属性获取该KClass对象所对应类的全部方法
    println("ReflectA 的全部方法如下：")
    val funs = kClass1.functions
    funs.forEach { println(it) }

    //通过 declaredFunctions 属性获取该KClass对象声明的全部方法
    println("ReflectA 本身声明的全部方法如下：")
    val declaFuns = kClass1.declaredFunctions
    declaFuns.forEach { println(it) }

    //通过 memberExtensionFunctions 属性获取全部扩展方法
    //Kotlin只能访问对象中的扩展方法 而不能访问类文件的扩展方法
    println("ReflectA 声明的扩展方法如下：")
    val exFuns = kClass1.declaredMemberExtensionFunctions
    exFuns.forEach { println(it) }


    //通过decaredMemberProperties获取全部成员属性
    val memberProperties = kClass1.declaredMemberProperties
    println("ReflectA 声明的成员属性如下：")
    memberProperties.forEach { println(it) }


    //通过memberExtensionProperties属性获取该KClass对象的全部扩展属性
    val exProperties = kClass1.memberExtensionProperties
    println("ReflectA 本身声明的扩展属性如下：")
    exProperties.forEach { println(it) }

    //通过annotations属性获取该KClass对象所对应类的全部注解
    val anns = kClass1.annotations
    println("ReflectA 的全部注解如下：")
    anns.forEach { println(it) }
    println("该KClass元素上的@Annot注解为：${kClass1.findAnnotation<Annot>()}")

    //通过nestedClasses属性获取所对应的全部嵌套类
    val inners = kClass1.nestedClasses
    println("ReflectA 的全部内部类如下：")
    inners.forEach { println(it) }

    //通过supertypes属性获取该类的所有父类型
    println("KClassTest的父类型为：${kClass1.supertypes}")

    println("---------- companion 对象 ---------") //
    val companion = kClass1.companionObject // 返回也是一个 KClass
    if (companion != null) {
        println("companion $companion")
        companion.declaredMemberProperties.forEach {
            println("companion declaredMemberProperties:  $it")
        }
        companion.declaredFunctions.forEach {
            println("companion declaredFunctions:  $it")
        }
    }


    println("---------- 创建对象 ---------")
    println(" ")
    println("createInstance 创建实例")
    // createInstance() 方法调用无参数的构造器创建实例
    val inst2 = kClass1.createInstance()
    println(inst2.name)
    println(inst2.age)

    println(" ")
    // primaryConstructor 主构造函数
    val cons1 = kClass1.primaryConstructor
    val inst1 = cons1?.call("hello reflect")  // 参入参数
    println(inst1)
    println("inst1 " + inst1?.name)

    println(" ")
    println("第一个构造函数")
    val cons2 = kClass1.constructors.first()
    println(cons2)

    println(" ")

    println("-------调用方法------")
    val funs3 = kClass1.declaredFunctions
    val inst3 = kClass1.createInstance()
    println("ReflectA 本身声明的全部方法如下：")
    funs3.forEach { println(it) }
    for (f in funs3) {
        if (f.name == "sayHi") {
            f.call(inst3)
        }
        if (f.name == "print") {
            f.call(inst3, "反射打印")
        }
    }

    println("\n")
    println("-------访问属性------")
    //通过decaredMemberProperties获取全部成员属性
    val memberProperties2 = kClass1.declaredMemberProperties
    val inst4 = kClass1.createInstance()
    println("ReflectA 本身声明的成员属性如下：")
    memberProperties2.forEach { println(it) }
    println("inst4 name: ${inst4.name}")
    memberProperties2.forEach {
        if (it.name == "age") {
            it as KMutableProperty1<ReflectA, Int>
            it.isAccessible = true
            it.set(inst4, 20)
            println(it.get(inst4))
        }

    }

}