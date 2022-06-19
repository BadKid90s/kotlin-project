package com.wry.kt.s6


//TODO kotlin 代数数据类型
fun main() {
    println(Teacher(Exam.FREATION4).show())
}

enum class Exam {
    FREATION1,
    FREATION2,
    FREATION3,
    FREATION4,
}

class Teacher(private val exam: Exam) {
    fun show() =
        when (exam) {
            Exam.FREATION1 -> "差"
            Exam.FREATION2 -> "及格"
            Exam.FREATION3 -> "良好"
            Exam.FREATION4 -> "优秀"
        }
}
