package com.xiazhi.chain;

import com.xiazhi.chain.impl.*;

/**
 * @author 赵帅
 * @date 2020/7/29
 */
public class Client {

    public static void main(String[] args) {
//        ICreditChain handle = new CreditHandleImpl();
//        handle.credit("RuleBadInfo");

        AbstractRequestHandle handle = new FatherRequestHandleImpl();
        AbstractRequestHandle handle1 = new HusbandRequestHandleImpl();
        AbstractRequestHandle handle2 = new SonRequestHandleImpl();
        handle.setNextHandle(handle1);
        handle1.setNextHandle(handle2);
        Woman woman = new Woman();
        woman.setStatus(Woman.WomenStatus.C.name());
        woman.setRequest("逛街");
        handle.handleRequest(woman);
    }
}
