package com.wry.kt.s7.KtBase130;

public class SingletonDemo {
    private static final SingletonDemo INSTANCE = new SingletonDemo();

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        return INSTANCE;
    }
}
