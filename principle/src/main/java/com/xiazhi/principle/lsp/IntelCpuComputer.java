package com.xiazhi.principle.lsp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class IntelCpuComputer {
    private IntelCpu cpu;

    public void run() {
        this.cpu.work();
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }
}
