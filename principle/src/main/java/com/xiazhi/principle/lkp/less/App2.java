package com.xiazhi.principle.lkp.less;

import java.util.Random;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/17
 **/
public class App2 {

    public void startRun() {
        int first = this.first();
        while (first == 1 || first == 0) {
            first = this.first();
        }

        System.out.println("第一步返回结果：" + first);
        if (first == 2) {
            this.second();

        } else if (first == 3) {

            System.out.println("安装进行第二步");
            int third = this.third();

            System.out.println("第二步返回结果" + third);
            if (third == 2) {

                System.out.println("进行安装第三步");
                this.four();
                this.second();
            }
        }
    }

    private int first() {
        System.out.println("开始安装，进行第一步");
        return new Random().nextInt(4);
    }

    private void second() {
        System.out.println("调用结束安装方法");
    }

    private int third() {
        System.out.println("调用第三个方法");
        return new Random().nextInt(3);
    }

    private void four() {
        System.out.println("调用第四个方法");
    }
}
