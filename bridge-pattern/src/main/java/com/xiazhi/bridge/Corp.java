package com.xiazhi.bridge;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class Corp {

    private IProduct product;

    /**
     * 挣钱
     */
    void makeMoney() {
        this.product.produce();
        this.product.sell();
    }

    public void setProduct(IProduct product) {
        this.product = product;
    }
}
