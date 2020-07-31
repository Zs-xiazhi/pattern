package com.xiazhi.singleton;

/**
 * 枚举，枚举是线程安全的，而且jvm保证单例
 * @author 赵帅
 * @date 2020/7/17
 */
public class EnumClassSingleton {

    private EnumClassSingleton() {
        System.out.println("枚举单例实例化");
    }

    public static EnumClassSingleton getInstance() {
        return EnumClassSingletonEnum.INSTANCE.getEnumClassSingleton();
    }

    private enum EnumClassSingletonEnum{
        /** 单例实力对象 */
        INSTANCE;

        private EnumClassSingleton enumClassSingleton;

        EnumClassSingletonEnum() {
            enumClassSingleton = new EnumClassSingleton();
        }

        public EnumClassSingleton getEnumClassSingleton() {
            return enumClassSingleton;
        }
    }
}
