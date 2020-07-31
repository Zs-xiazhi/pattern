package com.xiazhi.chain.impl;

import com.xiazhi.chain.ICreditChain;
import com.xiazhi.chain.ICreditHandle;

/**
 * 特殊名单
 * @author 赵帅
 * @date 2020/7/29
 */
public class RuleSpecialListCreditableChain implements ICreditHandle {

    @Override
    public void creditHandle(String code, ICreditChain creditHandle) {
        if (code == "RuleSpecialList") {
            System.out.println("调用特殊名单验证接口");
        } else {
            creditHandle.credit(code);
        }
    }
}
