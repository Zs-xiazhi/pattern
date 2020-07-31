package com.xiazhi.chain.impl;

import com.xiazhi.chain.ICreditChain;
import com.xiazhi.chain.ICreditHandle;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 赵帅
 * @date 2020/7/29
 */
public class CreditChainContainer {

    public static List<ICreditHandle> getCreditChainList() {
        LinkedList<ICreditHandle> list = new LinkedList<>();
        list.add(new RuleBadInfoCreditableChain());
        list.add(new RuleApplyLoanCreditableChain());
        list.add(new RuleSpecialListCreditableChain());
        return list;
    }
}
