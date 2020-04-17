package com.xiazhi.principle.lkp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/16
 **/
public class Traditional {

    public static void main(String[] args) {
        President president = new President();

        Counsellor counsellor = new Counsellor();
        president.setCounsellor(counsellor);
        president.makeCounsellorWork();
    }
}
