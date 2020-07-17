package com.xiazhi.bridge;

import org.junit.Test;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class Client {
    public static void main(String[] args) {
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }

    @Test
    public void fun1() {
        Corp corp = new Corp();
        corp.setProduct(new Clothes());
        corp.makeMoney();
        corp.setProduct(new Mac());
        corp.makeMoney();
    }
}
