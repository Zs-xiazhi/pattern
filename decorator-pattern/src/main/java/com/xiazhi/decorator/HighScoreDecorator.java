package com.xiazhi.decorator;

/**
 * @author 赵帅
 * @date 2020/7/9
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void highScore() {
        System.out.println("这次最高分：.....");
    }
    @Override
    public void report() {
        this.highScore();
        super.report();
    }
}
