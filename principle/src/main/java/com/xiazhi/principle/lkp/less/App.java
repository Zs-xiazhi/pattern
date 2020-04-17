package com.xiazhi.principle.lkp.less;

import java.util.Random;

/**
 * 假设一个软件，共有四个步骤：
 * 执行流程，当进入安装页面首先调用第一个方法，
 * 然后根据第一个方法的返回值决定调用第二个或者第三个方法。如果调用第二个方法则安装结束，如果调用第三个方法则根据返回结果决定是否调用第四个方法
 * 并结束安装。
 * @author ZhaoShuai
 * @date Create in 2020/4/17
 **/
public class App {

    public int first() {
        System.out.println("开始安装，进行第一步");
        return new Random().nextInt(4);
    }

    public void second() {
        System.out.println("调用结束安装方法");
    }

    public int third() {
        System.out.println("调用第三个方法");
        return new Random().nextInt(3);
    }

    public void four() {
        System.out.println("调用第四个方法");
    }

}
