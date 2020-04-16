package com.xiazhi.principle.isp;

/**
 * @author 赵帅
 * @date Create in 2020/4/13
 **/
public interface Bank {
    /**
     * 存款
     */
    void saving();

    /**
     * 取款
     */
    void fetch();

    /**
     * 转账
     */
    void transfer();

    /**
     * 理财
     */
    void manageMoney();
}
