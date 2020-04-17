package com.xiazhi.principle.lkp;

/**
 * 院长,院长只和辅导员做朋友
 * @author ZhaoShuai
 * @date Create in 2020/4/16
 **/
public class President {

    private Counsellor counsellor;

    public void makeCounsellorWork() {
        this.counsellor.makeStudentWork();
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }
}
