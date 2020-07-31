package com.xiazhi.chain.impl;

import com.xiazhi.chain.ICreditChain;
import com.xiazhi.chain.ICreditHandle;

/**
 * 自然人识别
 * @author 赵帅
 * @date 2020/7/29
 */
public class RuleBadInfoCreditableChain implements ICreditHandle {

    @Override
    public void creditHandle(String code, ICreditChain creditHandle) {
        if (code == "RuleBadInfo") {
            System.out.println("调用自然人识别接口");
        } else {
            creditHandle.credit(code);
        }
    }
}
