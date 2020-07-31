package com.xiazhi.mediator;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(100);

        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);

        Stock stock = new Stock(mediator);
        stock.clearStock();

    }
}
