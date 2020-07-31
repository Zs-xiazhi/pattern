package com.xiazhi.mediator;

import java.util.Random;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //销售IBM型号的电脑
    public void sellIBMComputer(int number) {
        super.abstractMediator.execute("s.sell", number);
    }

    //反馈销售情况,0——100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    //折价处理
    public void offSale() {
        System.out.println("折价销售IBM电脑" + super.abstractMediator.stock.getStockNumber() + "台");
    }
}
