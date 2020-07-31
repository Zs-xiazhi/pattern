package com.xiazhi.chain.impl;

import com.xiazhi.chain.ICreditChain;
import com.xiazhi.chain.ICreditHandle;

/**
 * 借贷意向验证
 * @author 赵帅
 * @date 2020/7/29
 */
public class RuleApplyLoanCreditableChain implements ICreditHandle {

    @Override
    public void creditHandle(String code, ICreditChain creditHandle) {
        if (code == "RuleApplyLoan") {
            System.out.println("调用借贷意向验证接口");
        } else {
            creditHandle.credit(code);
        }
    }
}
