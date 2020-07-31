package com.xiazhi.chain;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class Woman {

    public enum WomenStatus{
        /**
         * A: 未嫁从父
         * B: 嫁人从夫
         * C: 夫死从子
         */
        A,B,C;
    }

    private String status;
    private String request;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
