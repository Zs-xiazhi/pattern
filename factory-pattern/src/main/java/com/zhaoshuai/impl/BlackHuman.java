package com.zhaoshuai.impl;

import com.zhaoshuai.Human;

/**
 * @author 赵帅
 * @date 2020/7/7
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑种人笑");
    }

    @Override
    public void cry() {
        System.out.println("黑种人哭");
    }

    @Override
    public void run() {
        System.out.println("黑种人会跑");
    }
}
