package com.xiazhi.command;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
