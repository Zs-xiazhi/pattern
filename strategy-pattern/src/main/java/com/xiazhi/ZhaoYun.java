package com.xiazhi;

/**
 * @author 赵帅
 * @date 2020/7/7
 */
public class ZhaoYun {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext();
        context.setStrategy(new BackDoorStrategy());
        context.execute();
        context.setStrategy(new BlockEnemyStrategy());
        context.execute();
        context.setStrategy(new GiveGreenStrategy());
        context.execute();
    }
}
