package com.wry.kt.s5


//TODO kotlin 计算属性 与 防范静态条件
fun main() {
//    KtBase71().number = 0
//    val根本没有set函数，无法赋值，只要get函数
    //背后隐式代码：System.out.println(new KtBase71().getNumber())
    println(KtBase71().number)

    //背后隐式代码：System.out.println(new KtBase71().getNumber2())
    println(KtBase71().number2)


    println(KtBase71().getShowInfo())


}

class KtBase71 {
    val number: Int = 0

    /*
    private int number=0;

    public int getNumber(){
        return this.number;
    }
     */
    val number2: Int
        get() = (1..100).shuffled().first()
    /*
    为什么没有看到number2属性
    答：因为属于“计算属性”，内部没有使用到number2属性
    public int getNumber2(){
        return  (1..1000).shuffled().first();
    }
     */

    var info: String? = ""

    //防范竞态条件，当你调用成员变量时，可能为null,可能为“”,就必须采用防范竞态条件
    //这是Kt编程的规范化
    fun getShowInfo(): String {
        return this.info?.run { "最终结果：$this" } ?: "哈哈哈"
    }
}