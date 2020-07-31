package com.xiazhi.mediator;

/**
 * @author 赵帅
 * @date 2020/7/31
 */
public abstract class AbstractColleague {

    protected AbstractMediator abstractMediator;

    public AbstractColleague(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }
}
