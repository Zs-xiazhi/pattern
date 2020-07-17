package com.xiazhi.singleton;

import java.util.Objects;

/**
 * @author 赵帅
 * @date 2020/7/7
 */
public class Leader {

    /** 懒汉模式:用到的时候才会实例化 */
    private static volatile Leader leader;

    /** 饿汉模式：在类加载时就完成实例化*/
    private static final Leader INSTANCE = new Leader();

    private Leader() {
        System.out.println("leader".equalsIgnoreCase("LEADER"));
        System.out.println("leader instance");
    }

    public static Leader getInstance() {
        return INSTANCE;
    }

    /**
     * 获取单例，线程不安全，如果在多线程情况下会返回多个实例
     *
     * @return leader实例
     */
    public static Leader getInstance1() {
        if (Objects.isNull(leader)) {
            leader = new Leader();
        }
        return leader;
    }

    /**
     * 获取实例，线程安全，只会创建一个实例，但是效率过低，对整个方法加锁，锁的粒度太粗了
     *
     * @return leader实例
     */
    public static synchronized Leader getInstance2() {
        if (Objects.isNull(leader)) {
            leader = new Leader();
        }
        return leader;
    }

    /**
     * 线程不安全，多线程情况下，有可能多个线程同时进入第一个null判断内，然后多个线程都会等待锁，最后会创建多个对象
     * @return
     */
    public static Leader getInstance3() {
        if (Objects.isNull(leader)) {
            synchronized (Leader.class) {
                leader = new Leader();
            }
        }
        return leader;
    }

    public static Leader getInstance4() {
        if (Objects.isNull(leader)) {
            synchronized (Leader.class) {
                if (Objects.isNull(leader)) {
                    leader = new Leader();
                }
            }
        }
        return leader;
    }


    public void run() {
        System.out.println("运行");
    }
}
