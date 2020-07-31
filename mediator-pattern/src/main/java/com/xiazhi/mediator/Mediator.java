package com.xiazhi.mediator;

/**
 * @author 赵帅
 * @date 2020/7/31
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... args) {
        if ("p.buy".equals(str)) {
            this.buyComputer((Integer) args[0]);
        } else if ("s.sell".equals(str)) {
            this.sellComputer((Integer) args[0]);
        } else if ("s.offsell".equals(str)) {
            this.offsell();
        } else if ("st.clear".equals(str)) {
            this.clearStock();
        } else if ("st.get".equals(str)) {
            this.getStockNumber();
        }

    }

    private int getStockNumber() {
        return super.stock.getStockNumber();
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyCompute();
    }

    private void offsell() {
        System.out.println("折价销售电脑" + super.stock.getStockNumber() + "台");
    }

    private void sellComputer(Integer arg) {
        if (super.stock.getStockNumber() < arg) {
            super.purchase.buyComputer(arg);
        }
        super.stock.decrease(arg);

    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("销售好，在采购" + number + "台");
        } else {
            number = number / 2;
            System.out.println("销售不好，折半买" + (number) + "台");
        }
        super.stock.increase(number);
    }




}
