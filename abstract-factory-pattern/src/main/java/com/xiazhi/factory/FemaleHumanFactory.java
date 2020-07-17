package com.xiazhi.factory;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowFactory() {
        return super.createHuman(FemaleYellowHuman.class);
    }

    @Override
    public Human createWhiteFactory() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackFactory() {
        return new FemaleBlackHuman();
    }
}
