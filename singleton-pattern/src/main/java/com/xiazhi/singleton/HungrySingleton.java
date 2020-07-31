package com.xiazhi.singleton;

/**
 * 饿汉式单例模式
 * @author 赵帅
 * @date 2020/7/17
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("饿汉模式创建单例对象成功");
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }


}
