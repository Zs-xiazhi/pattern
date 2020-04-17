package com.xiazhi.principle.lkp.less;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/17
 **/
public class Client {

    public static void main(String[] args) {
        App app = new App();

        int first = app.first();
        while (first == 1 || first == 0) {
            first = app.first();
        }

        System.out.println("第一步返回结果：" + first);
        if (first == 2) {
            app.second();

        } else if (first == 3) {

            System.out.println("安装进行第二步");
            int third = app.third();

            System.out.println("第二步返回结果" + third);
            if (third == 2) {

                System.out.println("进行安装第三步");
                app.four();
                app.second();
            }
        }
    }
}
