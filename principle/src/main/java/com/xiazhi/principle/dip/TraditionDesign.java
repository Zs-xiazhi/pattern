package com.xiazhi.principle.dip;

/**
 * 传统设计
 * @author ZhaoShuai
 * @date Create in 2020/4/10
 **/
public class TraditionDesign {
    public static void main(String[] args) {
        Computer computer = new Computer();
        AMDCpu cpu = new AMDCpu();
        computer.setCpu(cpu);
        DDR4 ddr4 = new DDR4();
        computer.setMemory(ddr4);
        computer.run();
    }
}

class Computer{
    private AMDCpu cpu;
    private DDR4 memory;

    void run() {
        this.cpu.run();
        this.memory.run();
    }

    public AMDCpu getCpu() {
        return cpu;
    }

    public void setCpu(AMDCpu cpu) {
        this.cpu = cpu;
    }

    public DDR4 getMemory() {
        return memory;
    }

    public void setMemory(DDR4 memory) {
        this.memory = memory;
    }
}


class AMDCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("AMD CPU在工作");
    }
}
class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("Intel CPU在工作");
    }
}
class DDR3 implements Memory{

    @Override
    public void run() {
        System.out.println("DDR3 内存在工作");
    }
}
class DDR4 implements Memory{
    @Override
    public void run() {
        System.out.println("DDR4 内存在工作");
    }
}

