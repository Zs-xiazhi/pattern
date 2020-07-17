package com.xiazhi.builder;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class Client {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setCarModel(new BenChi());
        String[] sequence = {"start", "engine", "sound", "stop"};
        carBuilder.setSequence(Arrays.asList(sequence));
        carBuilder.run();
    }
}
