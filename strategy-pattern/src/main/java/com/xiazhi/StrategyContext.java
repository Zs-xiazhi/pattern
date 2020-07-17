package com.xiazhi;

/**
 * @author 赵帅
 * @date 2020/7/7
 */
public class StrategyContext {

    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.execute();
    }
}
