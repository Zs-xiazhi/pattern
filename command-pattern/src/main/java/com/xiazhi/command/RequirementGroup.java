package com.xiazhi.command;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class RequirementGroup extends Group {
    @Override
    void find() {
        System.out.println("找到需求组");
    }

    @Override
    void add() {
        System.out.println("增加需求");
    }

    @Override
    void delete() {
        System.out.println("删除需求");
    }

    @Override
    void change() {
        System.out.println("修改需求");
    }

    @Override
    void plan() {
        System.out.println("需求组给出计划");
    }
}
