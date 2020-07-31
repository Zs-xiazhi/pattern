package com.xiazhi.chain.impl;

import com.xiazhi.chain.Woman;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class FatherRequestHandleImpl extends AbstractRequestHandle {

    public FatherRequestHandleImpl() {
        super(Woman.WomenStatus.A);
    }

    @Override
    protected void response(Woman woman) {
        System.out.println(String.format("父亲处理请求:%s", woman.getRequest()));
    }
}
