package com.xiazhi.chain;

/**
 * @author 赵帅
 * @date 2020/7/29
 */
public interface ICreditHandle {

    /**
     * 责任处理接口
     * @param code
     * @param creditHandle
     */
    void creditHandle(String code, ICreditChain creditHandle);
}
