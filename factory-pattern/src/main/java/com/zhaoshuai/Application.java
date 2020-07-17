package com.zhaoshuai;


import com.xiazhi.IStrategy;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class Application implements IStrategy {
    @Override
    public void execute() {
        System.out.println("aa");
    }
}
