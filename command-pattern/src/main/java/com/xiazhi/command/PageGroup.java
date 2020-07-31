package com.xiazhi.command;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class PageGroup extends Group {
    @Override
    void find() {
        System.out.println("找到美工组");
    }

    @Override
    void add() {
        System.out.println("增加页面");
    }

    @Override
    void delete() {
        System.out.println("删除页面");
    }

    @Override
    void change() {
        System.out.println("修改页面");
    }

    @Override
    void plan() {
        System.out.println("美工组给出计划");
    }
}
