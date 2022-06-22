package com.wry.kt.s6


//TODO kotlin  map操作
fun main() {
    val list = listOf(
        Info("zs", 18),
        Info("ls", 20),
        Info("ww", 166)
    )

    //查询年龄小于25岁的人姓名
    val nameList = list.filter { it.age < 25 }.map { it.name }

    println(nameList)
}

data class Info(var name: String, val age: Int)

/*
java

public class MapClass {

    public static void main(String[] args) {

        List<InfoObj> list = Arrays.asList(
                new InfoObj("zs", 15),
                new InfoObj("ls", 20),
                new InfoObj("ww", 166)
        );

        List<String> nameList = list.stream()
                .filter(item -> item.getAge() < 25)
                .map(InfoObj::getName)
                .collect(Collectors.toList());

        System.out.println(nameList);

    }

}

class InfoObj {
    private String name;
    private Integer age;

    public InfoObj(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

 */





