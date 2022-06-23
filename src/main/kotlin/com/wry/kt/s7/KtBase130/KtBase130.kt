package com.wry.kt.s6


//TODO kotlin  单例模式
fun main() {


}

//1，饿汉式
/*
//java版
public class SingletonDemo {
    private static final SingletonDemo INSTANCE = new SingletonDemo();

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        return INSTANCE;
    }
}

//kotlin 版
object SingletonDemo2
 */
object SingletonDemo2


//2，懒汉式
/*
//java版
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

//kotlin 版
class SingletonDemo3Kt private constructor(){
    companion object {
        private val instance: SingletonDemo4? = null
            get() {
                return field ?: SingletonDemo4()
            }
        fun getInstanceAction(): SingletonDemo3Kt {
            return instance!!
        }
    }
}
 */

class SingletonDemo3Kt private constructor() {
    companion object {
        private val instance: SingletonDemo3Kt? = null
            get() {
                return field ?: SingletonDemo3Kt()
            }

        fun getInstanceAction(): SingletonDemo3Kt {
            return instance!!
        }
    }
}


//3，懒汉式  线程安全
/*
//java版
public class SingletonDemo4 {
    private static SingletonDemo4 INSTANCE;

    private SingletonDemo3() {
    }

    public static synchronized  SingletonDemo4getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonDemo4();
        }
        return INSTANCE;
    }
}

//kotlin 版
class SingletonDemo4Kt private constructor(){
    companion object {
        private val instance: SingletonDemo4? = null
            get() {
                return field ?: SingletonDemo4()
            }
        @Synchronized
        fun getInstanceAction(): SingletonDemo3Kt {
            return instance!!
        }
    }
}
 */
class SingletonDemo4Kt private constructor() {
    companion object {
        private val instance: SingletonDemo4Kt? = null
            get() {
                return field ?: SingletonDemo4Kt()
            }

        @Synchronized
        fun getInstanceAction(): SingletonDemo4Kt {
            return instance!!
        }
    }
}


//4，懒汉式  双重检查
/*
//java版
public class SingletonDemo4 {
    private static SingletonDemo4 INSTANCE;

    private SingletonDemo3() {
    }

    public static   SingletonDemo4getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDemo4.class){
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDemo4();
                }
            }
        }
        return INSTANCE;
    }
}

//kotlin 版
class SingletonDemo5Kt private constructor() {
    companion object {
        private val instance: SingletonDemo5Kt by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonDemo5Kt()
        }

        @Synchronized
        fun getInstanceAction(): SingletonDemo5Kt {
            return instance
        }
    }
}
 */
class SingletonDemo5Kt private constructor() {
    companion object {
        private val instance: SingletonDemo5Kt by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonDemo5Kt()
        }

        @Synchronized
        fun getInstanceAction(): SingletonDemo5Kt {
            return instance
        }
    }
}