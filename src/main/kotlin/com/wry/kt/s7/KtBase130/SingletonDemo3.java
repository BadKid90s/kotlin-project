package com.wry.kt.s7.KtBase130;

public class SingletonDemo3 {
    private static SingletonDemo3 INSTANCE;

    private SingletonDemo3() {
    }

    public static SingletonDemo3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonDemo3();
        }
        return INSTANCE;
    }
}
