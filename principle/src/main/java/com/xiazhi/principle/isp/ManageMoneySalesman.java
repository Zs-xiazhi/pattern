package com.xiazhi.principle.isp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/13
 **/
public class ManageMoneySalesman implements ManageMoney {
    @Override
    public void manageMoney() {
        System.out.println("理财");
    }
}
