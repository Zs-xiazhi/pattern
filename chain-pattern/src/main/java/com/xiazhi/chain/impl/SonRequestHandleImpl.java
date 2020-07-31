package com.xiazhi.chain.impl;

import com.xiazhi.chain.Woman;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class SonRequestHandleImpl extends AbstractRequestHandle {

    public SonRequestHandleImpl() {
        super(Woman.WomenStatus.C);
    }

    @Override
    protected void response(Woman woman) {
        System.out.println(String.format("儿子处理请求:%s", woman.getRequest()));
    }
}
