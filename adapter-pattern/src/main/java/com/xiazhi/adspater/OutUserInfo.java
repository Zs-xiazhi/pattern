package com.xiazhi.adspater;

import java.util.Map;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class OutUserInfo {

    private Map<String,Object> baseInfo;
    private Map<String,Object> homeInfo;
    private Map<String, Object> jobInfo;

    public Map<String, Object> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(Map<String, Object> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Map<String, Object> getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(Map<String, Object> homeInfo) {
        this.homeInfo = homeInfo;
    }

    public Map<String, Object> getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(Map<String, Object> jobInfo) {
        this.jobInfo = jobInfo;
    }
}
