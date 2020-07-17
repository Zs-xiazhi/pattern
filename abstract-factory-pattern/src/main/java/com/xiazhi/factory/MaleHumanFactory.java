package com.xiazhi.factory;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class MaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowFactory() {
        return super.createHuman(MaleYellowHuman.class);
    }

    @Override
    public Human createWhiteFactory() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackFactory() {
        return new MaleBlackHuman();
    }
}
