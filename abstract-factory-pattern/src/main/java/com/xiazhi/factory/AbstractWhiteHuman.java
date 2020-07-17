package com.xiazhi.factory;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白人笑");
    }

    @Override
    public void cry() {
        System.out.println("白人哭");
    }

    @Override
    public void run() {
        System.out.println("白人跑");
    }
}
