package com.xiazhi.bridge;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class Mac implements IProduct {
    @Override
    public void produce() {
        System.out.println("produce mac");
    }

    @Override
    public void sell() {
        System.out.println("sell mac");
    }
}
