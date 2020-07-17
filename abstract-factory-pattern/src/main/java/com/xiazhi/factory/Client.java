package com.xiazhi.factory;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class Client {

    public static void main(String[] args) {
        HumanFactory factory = new MaleHumanFactory();
        Human human = factory.createBlackFactory();
        human.run();
        human.cry();
        human.laugh();
        human.sex();
    }
}
