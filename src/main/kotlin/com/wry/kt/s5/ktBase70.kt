package com.wry.kt.s5

import java.util.*


//TODO kotlin 定义类与field关键字
fun main() {
    val stu = Student()
    //背后隐式代码：new Student().getName()
    println(stu.name)
    //背后隐式代码：new Student().setAge()
    stu.age = 18

    println("${stu.name} ------${stu.age} ----${stu.info}---${stu.getLowName()}")

}

class Student {
    var name = "AAAaaa"

    /*
     背后隐式代码,默认存在
        get() {
            return field
        }
        set(value) {
            field = value
        }
     */
    var age = 19

    /*
    背后隐式代码,默认存在
       get() {
           return field
       }
       set(value) {
           field = value
       }
    */

    var info: String? = null

    /*
   背后隐式代码,默认存在
      get() {
          return field
      }
      set(value) {
          field = value
      }
   */
    fun getLowName(): String {
        return name.lowercase(Locale.getDefault())
    }
    /*
   背后隐式代码,默认存在
      public String getLowName(){
        return name.lowercase(Locale.getDefault());
      }
   */
}
/*
public final class Student {
   @NotNull
   private String name = "AAAaaa";
   private int age = 19;
   @Nullable
   private String info;

   @NotNull
   public final String getName() {
      return this.name;
   }

   public final void setName(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.name = var1;
   }

   public final int getAge() {
      return this.age;
   }

   public final void setAge(int var1) {
      this.age = var1;
   }

   @Nullable
   public final String getInfo() {
      return this.info;
   }

   public final void setInfo(@Nullable String var1) {
      this.info = var1;
   }

   @NotNull
   public final String getLowName() {
      String var1 = this.name;
      Locale var10000 = Locale.getDefault();
      Intrinsics.checkNotNullExpressionValue(var10000, "Locale.getDefault()");
      Locale var2 = var10000;
      String var3 = var1.toLowerCase(var2);
      Intrinsics.checkNotNullExpressionValue(var3, "this as java.lang.String).toLowerCase(locale)");
      return var3;
   }
}
 */
