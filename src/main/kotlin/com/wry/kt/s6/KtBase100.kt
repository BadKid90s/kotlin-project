package com.wry.kt.s6


//TODO kotlin 接口
fun main() {
    val impl = KtBase100Impl()
    println(impl.getInfo())
    println(impl.getInfo())

    var mouse = Mouse()
    var keyBoard = KeyBoard()
    showUsbInfo(mouse)
    showUsbInfo(keyBoard)


}

//1.接口里所有成员和接口本身都是public open修饰的
//2.接口不能有构造函数
//3.实现类不仅仅要重新接口函数，还要重写接口的成员
interface USB {
    /**
     * 版本
     */
    var usbVersion: String

    /**
     * 驱动
     */
    var usbDevice: String

    /**
     * 动作
     */
    fun action(): String
}

class Mouse(
    override var usbVersion: String = "USB3.0",
    override var usbDevice: String = "鼠标"
) : USB {
    override fun action(): String {
        return "接入了版本为$usbVersion 的设备：$usbDevice"
    }

}

class KeyBoard(
    override var usbVersion: String = "USB3.0",
    override var usbDevice: String = "键盘"
) : USB {
    override fun action(): String {
        return "接入了版本为$usbVersion 的设备：$usbDevice"
    }

}

fun showUsbInfo(usb:USB){
    println(usb.action())
}


interface KtBase100 {
    /**
     * 获取数据信息
     */
    fun getInfo(): String
}

class KtBase100Impl : KtBase100 {

    override fun getInfo(): String {
        return "INFORMATION....."
    }

}
