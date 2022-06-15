package com.wry.kt.s2

//TODO kotlin语言的"it"关键字
fun main() {

    val methodActon: (Int, Int) -> String = { x, y ->
        var num = 0;
        if (x % 2 == 0) {
            num = x
        } else {
            num = y
        }
        "Hello word -------$num"

    }
    //参数只有一个，可以不写，默认参数名 “it”
    val methodActon2: (String) -> Int = {
        var count = 0;

        for (c in it) {
            if (c == 'r') {
                count++;
            }
        }
        count
    }
}


