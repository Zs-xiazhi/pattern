package com.xiazhi.adspater;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class Client {

    public static void main(String[] args) {
        IUserInfo adapter = new UserInfoAdapter();
        UserInfo userInfo = new UserInfo();
        adapter.setName(userInfo.getName());
        System.out.println("userInfo = " + userInfo);
    }
}
