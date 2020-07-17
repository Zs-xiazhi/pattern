package com.xiazhi.decorator;

/**
 * @author 赵帅
 * @date 2020/7/9
 */
public class FouthSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的家长：");
        System.out.println("..............");
        System.out.println("语文：68，数学：70，英语：59，自然：80");
        System.out.println("...........");
        System.out.println("家长签名：");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名：" + name);
    }
}
