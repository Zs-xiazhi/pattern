package com.zhaoshuai;

import com.xiazhi.IStrategy;
import com.zhaoshuai.impl.BlackHuman;
import com.zhaoshuai.impl.WhiteHuman;
import com.zhaoshuai.impl.YellowHuman;
import org.junit.Assert;
import org.junit.Test;
import sun.applet.AppletClassLoader;
import sun.text.Normalizer;

import java.util.List;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class NvWa {
    public static void main(String[] args) {
        Human human = HumanFactory.getInstance(YellowHuman.class);
        human.laugh();
        human.cry();
        human.run();

        Human blackHuman = HumanFactory.getInstance(BlackHuman.class);
        blackHuman.run();
        blackHuman.cry();
        blackHuman.laugh();

        Human instance = HumanFactory.getInstance(WhiteHuman.class);
        instance.laugh();
        instance.cry();
        instance.run();
    }

    @Test
    public void fun1() {
        List<Class<?>> classes = ClassUtils.getAllClassByInterface(IStrategy.class);
        for (Class<?> aClass : classes) {
            System.out.println("aClass = " + aClass);
        }
    }

    @Test
    public void fun2() {
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
        ClassLoader classLoader1 = NvWa.class.getClassLoader();
        System.out.println("classLoader1 = " + classLoader1);
        Class<? extends ClassLoader> aClass = classLoader1.getClass();
        System.out.println("aClass = " + aClass);

        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println("classLoader2 = " + classLoader2);


    }
}
