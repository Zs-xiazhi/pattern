package com.xiazhi.factory;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public abstract class AbstractYellowHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黄人笑");
    }

    @Override
    public void cry() {
        System.out.println("黄人哭");
    }

    @Override
    public void run() {
        System.out.println("黄人跑");
    }
}
