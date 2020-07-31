package com.xiazhi.command;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public abstract class Command {

    protected RequirementGroup rg = new RequirementGroup();
    protected CodeGroup cg = new CodeGroup();
    protected PageGroup pg = new PageGroup();

    abstract void execute();
}
