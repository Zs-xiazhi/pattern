package com.xiazhi.chain;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public interface RequestHandle {

    Woman.WomenStatus getStatus();

    void handleRequest(Woman woman, RequestHandle requestHandle);
}
