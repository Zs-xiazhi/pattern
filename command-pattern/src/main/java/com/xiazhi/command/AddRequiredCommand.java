package com.xiazhi.command;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class AddRequiredCommand extends Command {
    @Override
    void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
