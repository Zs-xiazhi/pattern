package com.xiazhi.observer;

/**
 * 事件发布接口。
 * 这个接口用来定义事件的添加删除观察者以及发布事件。
 *
 * ****相当于观察者模式中的抽象主题。
 *
 * 此接口的实现要求有一个列表用来维护观察者对象。
 * @author 赵帅
 * @date 2020/7/30
 */
public interface EventMulticaster {

    /**
     * 用于添加一个监听器，也就是添加一个观察者
     * @param listener 需要添加的观察者对象
     */
    void addListener(EventListener<? extends AbstractEvent> listener);

    /**
     * 移除一个监听器。从实现类维护的观察者列表中移除一个观察者
     * @param listener
     */
    void removeListener(EventListener<? extends AbstractEvent> listener);

    /**
     * 广播事件给所有的监听器，对此事件有兴趣的监听器会处理事件
     * @param event 事件对象
     */
    void multicastEvent(AbstractEvent event);

}
