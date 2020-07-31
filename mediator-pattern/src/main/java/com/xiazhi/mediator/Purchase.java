package com.xiazhi.mediator;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void buyComputer(int number) {
        super.abstractMediator.execute("p.buy", number);
    }

    public void refuseBuyCompute() {
        System.out.println("不再买电脑了");
    }
}
