package com.wry.kt.s6


//TODO kotlin 扩展属性
fun main() {
    println("wry".myInfo)
    "wry".chainPrint().chainPrint().chainPrint()
}

//打印输出 并且链式调用
fun String.chainPrint(): String {
    println("打印输出: $this")
    return this
}


//定义变量
val myStr: String = "AAA"
/*
public final class KtBase117kt{

    @NotNull
    private static final String myStr="AAA"

    @NotNull
    public static final String getMyStr(){
        return myStr;
    }
}
 */

//扩展属性
val String.myInfo: String
    get() = "info:$this"
/*
public final class KtBase117kt{

    @NotNull
    private static final String myInfo=""

    @NotNull
    public static final String getMyInfo(@NotNull String $this.$myInfo){
       //校验
       //返回
       return "info:" + $this.$myInfo ;
    }
}
 */