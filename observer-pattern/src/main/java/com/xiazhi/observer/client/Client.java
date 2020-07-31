package com.xiazhi.observer.client;

import com.xiazhi.observer.impl.SimpleEventMulticaster;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class Client {

    public static void main(String[] args) {
        SimpleEventMulticaster multicaster = new SimpleEventMulticaster();
        RegisterListener listener = new RegisterListener();
        multicaster.addListener(listener);

        RegisterEvent event = new RegisterEvent(new String());
        multicaster.multicastEvent(event);
    }
}
