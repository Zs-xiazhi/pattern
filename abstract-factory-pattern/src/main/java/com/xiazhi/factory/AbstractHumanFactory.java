package com.xiazhi.factory;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public abstract class AbstractHumanFactory implements HumanFactory{

    public Human createHuman(Class clazz) {
        try {
            return (Human)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
