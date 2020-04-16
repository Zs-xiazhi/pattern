package com.xiazhi.principle.dip;

/**
 * 依赖倒置原则
 * @author ZhaoShuai
 * @date Create in 2020/4/9
 **/
public class DependenceInversionPrinciple {

    static class Computer{
        private Cpu cpu;
        private Memory memory;

        void run() {
            this.cpu.run();
            this.memory.run();
        }

        public Cpu getCpu() {
            return cpu;
        }

        public void setCpu(Cpu cpu) {
            this.cpu = cpu;
        }

        public Memory getMemory() {
            return memory;
        }

        public void setMemory(Memory memory) {
            this.memory = memory;
        }
    }

    public static void main(String[] args) {
        Computer computer = new DependenceInversionPrinciple.Computer();
        computer.setCpu(new AMDCpu());
        computer.setMemory(new DDR4());
        computer.run();
    }
}
interface Cpu{
    void run();
}
interface Memory{
    void run();
}




