package com.wry.kt.s6


//TODO kotlin 接口的默认实现
fun main() {
//接口 var属性是不能给属性赋值
//任何类、接口等 val 修饰的是只读，不能进行赋值
    val mouse = Mouse2()
    val keyBoard = KeyBoard2()
    showUsbInfo2(mouse)
    showUsbInfo2(keyBoard)

}

//1.接口里所有成员和接口本身都是public open修饰的
//2.接口不能有构造函数
//3.实现类不仅仅要重新接口函数，还要重写接口的成员
interface USB2 {
    /**
     * 版本
     */
    val usbVersion: String
        get() = (1..3).shuffled().last().toString()

    /**
     * 驱动
     */
    val usbDevice: String
        get() = "高级设备"

    /**
     * 动作
     */
    fun action(): String{
        return "默认的实现！"
    }
}

class Mouse2(
    override var usbVersion: String = "USB3.0",
    override var usbDevice: String = "鼠标"
) : USB2

class KeyBoard2(
    override var usbVersion: String = "USB3.0",
    override var usbDevice: String = "键盘"
) : USB2 {
    override fun action(): String {
        return "接入了版本为$usbVersion 的设备：$usbDevice"
    }

}

fun showUsbInfo2(usb: USB2) {
    println(usb.action())
}

