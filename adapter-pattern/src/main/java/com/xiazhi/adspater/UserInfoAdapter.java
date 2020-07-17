package com.xiazhi.adspater;

import org.jetbrains.annotations.NotNull;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class UserInfoAdapter extends OutUserInfo implements IUserInfo{


    @Override
    public String getName() {
        return (String) super.getBaseInfo().get("name");
    }

    @Override
    public void setName(@NotNull String name) {
        super.getBaseInfo().put("name", name);
    }

    @Override
    public String getAge() {
        return null;
    }

    @Override
    public void setAge(String age) {

    }

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public void setSex(String sex) {

    }

    @Override
    public String getMobile() {
        return null;
    }

    @Override
    public void setMobile(String mobile) {

    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }

    @Override
    public String getOfficeNumber() {
        return null;
    }

    @Override
    public void setOfficeNumber(String officeNumber) {

    }

    @Override
    public String getJobName() {
        return null;
    }

    @Override
    public void setJobName(String jobName) {

    }
}
