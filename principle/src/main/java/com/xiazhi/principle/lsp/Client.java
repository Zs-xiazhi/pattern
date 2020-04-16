package com.xiazhi.principle.lsp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class Client {


    public static void main(String[] args) {
        Computer computer = new Computer();
        Cpu cpu = new Cpu();
        computer.setCpu(cpu);
        computer.run();

        Cpu intelCpu = new IntelCpu();
        computer.setCpu(intelCpu);
        computer.run();

    }
}
