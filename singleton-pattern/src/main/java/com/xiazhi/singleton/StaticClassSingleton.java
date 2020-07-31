package com.xiazhi.singleton;

/**
 * 静态内部类单例模式，饿汉模式的升级版，解决了饿汉模式不能延迟加载的问题。
 * @author 赵帅
 * @date 2020/7/17
 */
public class StaticClassSingleton {

    private static StaticClassSingleton instance;

    private StaticClassSingleton() {
        System.out.println("静态内部类单例对象实力化");
    }

    /**
     * 在外部加载StaticClassSingleton类时，只要没有调用getInstance方法，那么就不会加载内部类，不加载内部类自然就不会实例化。
     */
    private static class StaticClassSingletonInstance{
        private static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }

    public static StaticClassSingleton getInstance() {
        return StaticClassSingletonInstance.INSTANCE;
    }
}
