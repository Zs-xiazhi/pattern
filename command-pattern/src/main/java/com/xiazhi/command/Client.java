package com.xiazhi.command;

import org.junit.Test;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class Client {

    @Test
    public void fun1() {
        RequirementGroup group = new RequirementGroup();
        group.find();
        group.add();
        group.plan();
    }

    @Test
    public void fun2() {
        Invoker invoker = new Invoker(new AddRequiredCommand());
        invoker.execute();
    }
}
