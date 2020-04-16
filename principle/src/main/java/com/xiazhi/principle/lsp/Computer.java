package com.xiazhi.principle.lsp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class Computer {

    private Cpu cpu;

    public void run() {
        this.cpu.work();
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
