package com.xiazhi.adspater;

import org.jetbrains.annotations.NotNull;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public interface IUserInfo {

    String getName();

    /**
     * 设置名子
     * @param name 名称
     */
    void setName(@NotNull String name);

    /**
     * 返回年龄
     * @return
     */
    @NotNull
    String getAge();

    void setAge(String age);

    String getSex();

    void setSex(String sex);

    String getMobile();

    void setMobile(String mobile);

    String getAddress();

    void setAddress(String address);

    String getOfficeNumber();

    void setOfficeNumber(String officeNumber);

    String getJobName();

    void setJobName(String jobName);
}
