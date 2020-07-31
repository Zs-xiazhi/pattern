package com.xiazhi.observer;

/**
 * 监听器接口，具体的每一个监听器都要求实现这个接口，也就是说每一个接口只能处理一个事件。
 * 此接口的实现就相当于是观察者模式中的具体观察者。监听器==观察者。
 *
 * 此接口==观察者模式中的抽象观察者
 *
 * @author 赵帅
 * @date 2020/7/30
 */
public interface EventListener<T extends AbstractEvent> {

    /**
     * 处理事件
     * @param event 要处理的事件对象
     */
    void onEvent(AbstractEvent event);

}
