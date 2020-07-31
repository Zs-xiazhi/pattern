package com.xiazhi.chain.impl;

import com.xiazhi.chain.Woman;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class HusbandRequestHandleImpl extends AbstractRequestHandle {

    public HusbandRequestHandleImpl() {
        super(Woman.WomenStatus.B);
    }

    @Override
    protected void response(Woman woman) {
        System.out.println(String.format("丈夫处理请求:%s", woman.getRequest()));
    }
}
