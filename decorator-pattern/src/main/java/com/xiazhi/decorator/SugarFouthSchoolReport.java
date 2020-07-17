package com.xiazhi.decorator;

/**
 * @author 赵帅
 * @date 2020/7/9
 */
public class SugarFouthSchoolReport extends FouthSchoolReport {

    private void reportHighScore() {
        System.out.println("这次考试最高分：.....");
    }

    private void sort() {
        System.out.println("我的排名：...");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.sort();
    }
}
