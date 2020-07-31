package com.xiazhi.observer.impl;

import com.xiazhi.observer.AbstractEvent;
import com.xiazhi.observer.EventListener;
import com.xiazhi.observer.EventMulticaster;

import java.lang.reflect.ParameterizedType;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 事件广播器的具体实现 == 观察者模式中的具体目标类
 *
 * @author 赵帅
 * @date 2020/7/30
 */
public class SimpleEventMulticaster implements EventMulticaster {

    private Map<String, List<EventListener<? extends AbstractEvent>>> map = new ConcurrentHashMap<>(16);

    @Override
    public void addListener(EventListener<? extends AbstractEvent> listener) {
        String className = getEventType(listener);
        List<EventListener<? extends AbstractEvent>> listeners = this.map.get(className);
        if (Objects.isNull(listeners)) {
            listeners = new LinkedList<>();
            this.map.put(className, listeners);
        }

        listeners.add(listener);
    }

    @Override
    public void removeListener(EventListener<? extends AbstractEvent> listener) {
        List<EventListener<? extends AbstractEvent>> listeners = this.map.get(getEventType(listener));
        if (Objects.nonNull(listeners)) {
            listeners.remove(listener);
        }
    }

    @Override
    public void multicastEvent(AbstractEvent event) {
        String name = event.getClass().getName();
        List<EventListener<? extends AbstractEvent>> listeners = this.map.get(name);
        for (EventListener<? extends AbstractEvent> listener : listeners) {
            listener.onEvent(event);
        }
    }

    private String getEventType(EventListener<?> listener) {
        ParameterizedType type = (ParameterizedType) listener.getClass().getGenericInterfaces()[0];
        return type.getActualTypeArguments()[0].getTypeName();
    }
}
