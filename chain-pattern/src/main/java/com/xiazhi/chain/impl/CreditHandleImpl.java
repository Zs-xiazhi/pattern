package com.xiazhi.chain.impl;

import com.xiazhi.chain.ICreditChain;
import com.xiazhi.chain.ICreditHandle;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 赵帅
 * @date 2020/7/29
 */
public class CreditHandleImpl implements ICreditChain {

    private static List<ICreditHandle> list;

    static {
        list = CreditChainContainer.getCreditChainList();
    }

    private int i;

    @Override
    public void credit(String code) {
        if (list != null && i != list.size()) {
            ICreditHandle iCreditHandle = list.get(i++);
            iCreditHandle.creditHandle(code, this);
        }
    }
}
