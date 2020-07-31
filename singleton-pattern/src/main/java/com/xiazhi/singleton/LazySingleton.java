package com.xiazhi.singleton;

/**
 * @author 赵帅
 * lazy man singleton pattern 懒汉模式
 * @date 2020/7/17
 */
public class LazySingleton {

    /** 返回单例对象 */
    private static LazySingleton instance = null;

    /** 单例模式，构造方法私有 */
    private LazySingleton() {
        System.out.println("懒汉模式 单例对象被实例化");
    }

    /**
     * 懒汉模式：在使用到对象时，才会实力化，在单线程内是单例的，但是多线程的情况下就会出现实力化多个对象的情况，因此线程不安全。
     * @return
     */
    public static LazySingleton getInstance() {
        if (LazySingleton.instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
