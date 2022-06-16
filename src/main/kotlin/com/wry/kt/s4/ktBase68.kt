package com.wry.kt.s4

import java.io.File

//TODO kotlin Map遍历
fun main() {
    val map = mapOf("qw" to (1), "ls" to (2))

    for (entry in map) {
        print("\t ${entry.key}--- ${entry.value}")
    }
    println()

    map.forEach{
        print("\t ${it.key}--- ${it.value}")
    }
    println()

    map.forEach{ (key, value) ->
        print("\t $key--- $value")
    }
    println()

    for (key in map.keys) {
        print("\t $key--- ${map[key]}")
    }
    println()

    for (value in map.values) {
        print("\t $value---")
    }
}