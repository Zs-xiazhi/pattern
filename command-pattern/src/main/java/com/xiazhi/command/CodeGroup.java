package com.xiazhi.command;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class CodeGroup extends Group {
    @Override
    void find() {
        System.out.println("找到代码组");
    }

    @Override
    void add() {
        System.out.println("增加代码");
    }

    @Override
    void delete() {
        System.out.println("删除代码");
    }

    @Override
    void change() {
        System.out.println("修改代码");
    }

    @Override
    void plan() {
        System.out.println("代码组给出计划");
    }
}
