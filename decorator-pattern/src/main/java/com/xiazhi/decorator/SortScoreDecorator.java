package com.xiazhi.decorator;

/**
 * @author 赵帅
 * @date 2020/7/9
 */
public class SortScoreDecorator extends Decorator {
    public SortScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void sort() {
        System.out.println("我的排名：..");
    }

    @Override
    public void report() {
        super.report();
        this.sort();
    }
}
