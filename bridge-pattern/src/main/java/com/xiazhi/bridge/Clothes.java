package com.xiazhi.bridge;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class Clothes implements IProduct {
    @Override
    public void produce() {
        System.out.println("produce clothes");
    }

    @Override
    public void sell() {
        System.out.println("sell clothes");
    }
}
