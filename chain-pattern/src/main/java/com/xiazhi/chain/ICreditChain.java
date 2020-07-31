package com.xiazhi.chain;

/**
 * @author 赵帅
 * @date 2020/7/29
 */
public interface ICreditChain {

    /**
     * 调用外部征信机构
     * @param code 调用的产品代码
     */
    void credit(String code);
}
