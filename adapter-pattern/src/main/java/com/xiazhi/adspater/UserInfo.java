package com.xiazhi.adspater;

import org.jetbrains.annotations.NotNull;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class UserInfo implements IUserInfo {

    /** 基本信息 */
    private String name;
    private String age;
    private String sex;

    /** 联系方式 */
    private String mobile;
    private String address;

    /** 职位信息 */
    private String officeNumber;
    private String jobName;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(@NotNull String name) {
        this.name = name;
    }
    @Override
    public String getAge() {
        return age;
    }
    @Override
    public void setAge(String age) {
        this.age = age;
    }
    @Override
    public String getSex() {
        return sex;
    }
    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String getMobile() {
        return mobile;
    }
    @Override
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String getOfficeNumber() {
        return officeNumber;
    }
    @Override
    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
    @Override
    public String getJobName() {
        return jobName;
    }
    @Override
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
