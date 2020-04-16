package com.xiazhi.principle.lsp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class AmdCpu extends Cpu {

    @Override
    public void work() {
        System.out.println("AMD CPU在工作");
    }
}
