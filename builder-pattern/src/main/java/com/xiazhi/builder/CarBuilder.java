package com.xiazhi.builder;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class CarBuilder {

    private CarModel carModel;

    private List<String> sequence;

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

    public void run() {
        for (String s : sequence) {
            if ("start".equals(s)) {
                this.carModel.start();
            } else if ("stop".equals(s)) {
                this.carModel.stop();
            } else if ("engine".equals(s)) {
                this.carModel.engine();
            } else if ("sound".equals(s)) {
                this.carModel.sound();
            }
        }
    }
}
