package com.wry.kt.s7

//TODO 注解@JvmOverloads与Kotlin

//重载方法，提供没有默认值参数的方法
@JvmOverloads
fun show(name: String, age: Int = 0) {
    println("name :$name age:$age")
}

/*
   @JvmOverloads
   public static final void show(@NotNull String name, int age) {
      Intrinsics.checkNotNullParameter(name, "name");
      String var2 = "name :" + name + " age:" + age;
      System.out.println(var2);
   }

   @JvmOverloads
   public static final void show(@NotNull String name) {
      show$default(name, 0, 2, (Object)null);
   }

 */