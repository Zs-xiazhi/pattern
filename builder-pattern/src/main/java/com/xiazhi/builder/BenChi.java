package com.xiazhi.builder;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class BenChi implements CarModel {
    @Override
    public void start() {
        System.out.println("奔驰启动");
    }

    @Override
    public void stop() {
        System.out.println("奔驰停止");
    }

    @Override
    public void engine() {
        System.out.println("奔驰引擎响");
    }

    @Override
    public void sound() {
        System.out.println("奔驰鸣笛");
    }
}
