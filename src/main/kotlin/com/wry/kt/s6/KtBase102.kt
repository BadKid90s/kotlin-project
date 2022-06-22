package com.wry.kt.s6


//TODO kotlin 抽象类
fun main() {
    val activity = MainActivity()
    activity.onCreate()
}

abstract class BaseActivity {
    fun onCreate() {

        setContentView(getLayoutId())

        initView()

        initData()

        initXXX()

    }

    abstract fun initXXX()

    abstract fun initData()

    abstract fun initView()

    private fun setContentView(layoutId: Int) = println("布局Id:$layoutId")

    abstract fun getLayoutId(): Int
}

class MainActivity : BaseActivity() {
    override fun initXXX() {
        println("init XXXX")
    }

    override fun initData() {
        println("init Data")

    }

    override fun initView() {
        println("init View")

    }

    override fun getLayoutId(): Int {
        return 1
    }
}