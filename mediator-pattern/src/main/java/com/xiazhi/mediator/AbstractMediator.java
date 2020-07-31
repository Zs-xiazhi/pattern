package com.xiazhi.mediator;

/**
 * @author 赵帅
 * @date 2020/7/31
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    public abstract void execute(String str, Object... args);
}
