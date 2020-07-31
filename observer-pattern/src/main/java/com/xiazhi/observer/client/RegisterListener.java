package com.xiazhi.observer.client;

import com.xiazhi.observer.AbstractEvent;
import com.xiazhi.observer.EventListener;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public class RegisterListener implements EventListener<RegisterEvent> {

    @Override
    public void onEvent(AbstractEvent event) {
        System.out.println("进入监听器，处理对象：" + event.getClass().getName());
    }
}
