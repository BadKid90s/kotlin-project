package com.wry.kt.s7

//TODO 注解@JvmField与Kotlin
class Person {
    @JvmField
    val names = listOf("zs", "ls", "ww")
}


/*
public final class Person{

   private final List<String> names;

   public final List getNames(){
        return this.names;
   }

    public static final void main(){
        main();
    }

    public static void main(String[] args){
        main();
    }

}
 */


/* jvmField
public final class Person {
   @JvmField
   @NotNull
   public final List names = CollectionsKt.listOf(new String[]{"zs", "ls", "ww"});
}
 */