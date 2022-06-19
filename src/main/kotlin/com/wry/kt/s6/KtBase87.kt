package com.wry.kt.s6


//TODO kotlin 对象声明学习
fun main() {
    //被object修饰的类，即是单例对象，也是类名
    println(KtBase87)
    KtBase87.show()


}

object KtBase87 {
    init {
        println("init.......")
    }

    fun show() = println("wo shi show")
}
/*
编译class代码后
public final class KtBase87 {
   @NotNull
   public static final KtBase87 INSTANCE;

   public final void show() {
      String var1 = "wo shi show";
      System.out.println(var1);
   }

   private KtBase87() {
   }

   static {
      KtBase87 var0 = new KtBase87();
      INSTANCE = var0;
      String var1 = "init.......";
      System.out.println(var1);
   }
}

 */
