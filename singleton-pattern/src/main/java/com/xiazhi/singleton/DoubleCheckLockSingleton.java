package com.xiazhi.singleton;

/**
 * DCL单例模式：
 * 懒汉模式升级版，不过线程安全
 * @author 赵帅
 * @date 2020/7/17
 */
public class DoubleCheckLockSingleton {

    /** 添加volatile字段是为了防止指令重排序 */
    private static volatile DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {
        System.out.println("DCL 单例对象实力化");
    }


    public static DoubleCheckLockSingleton getInstance() {

        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
