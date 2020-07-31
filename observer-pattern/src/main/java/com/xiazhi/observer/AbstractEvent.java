package com.xiazhi.observer;

/**
 * 抽象事件源，自定义事件需要继承这个类。
 * 思考监听器所需的构件：
 * 1. 事件对象
 * 2. 广播器
 * 3. 监听器
 * @author 赵帅
 * @date 2020/7/30
 */
public abstract class AbstractEvent {

    private Object source;

    public AbstractEvent(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
