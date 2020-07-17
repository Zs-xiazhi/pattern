package com.zhaoshuai;

/**
 * @author 赵帅
 * @date 2020/7/7
 */
public class HumanFactory {

    public static Human getInstance(Class<?> clazz){
        try {
            return (Human) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
