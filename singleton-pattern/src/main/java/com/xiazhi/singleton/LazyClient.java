package com.xiazhi.singleton;

import org.junit.Test;

/**
 * @author 赵帅
 * @date 2020/7/17
 */
public class LazyClient {

    @Test
    public void fun1() throws ClassNotFoundException {

        // 懒汉模式，延迟初始化，用的时候才会初始化
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("instance = " + instance);
        System.out.println("+++++++++++++++++++++");

        // 饿汉模式，不支持延迟初始化，在类加载阶段就会完成对象的初始化
        Class.forName("com.xiazhi.singleton.HungrySingleton");
        System.out.println("HungrySingleton.getInstance() = " + HungrySingleton.getInstance());
        System.out.println("+++++++++++++++++++++");

        // DCL单例，多线程安全
        new Thread(DoubleCheckLockSingleton::getInstance).start();
        new Thread(DoubleCheckLockSingleton::getInstance).start();
        System.out.println("++++++++++++++++++++");

        Class.forName("com.xiazhi.singleton.StaticClassSingleton");
        System.out.println("--------------");
        // 方法执行到这里还没有实力化对象，说明静态内部类单例在类加载时没有实力化，在调用方法时才实力化
        System.out.println("StaticClassSingleton.getInstance() = " + StaticClassSingleton.getInstance());
        System.out.println("+++++++++++++++++");

        System.out.println("EnumClassSingleton.getInstance() = " + EnumClassSingleton.getInstance());


    }
}
