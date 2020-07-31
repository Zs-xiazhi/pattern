package com.xiazhi.chain.impl;

import com.xiazhi.chain.RequestHandle;
import com.xiazhi.chain.Woman;
import org.jetbrains.annotations.NotNull;

/**
 * @author 赵帅
 * @date 2020/7/30
 */
public abstract class AbstractRequestHandle {

    private AbstractRequestHandle nextHandle;
    private Woman.WomenStatus status;

    public AbstractRequestHandle(Woman.WomenStatus status) {
        this.status = status;
    }

    public void setNextHandle(AbstractRequestHandle nextHandle) {
        this.nextHandle = nextHandle;
    }

    protected abstract void response(Woman woman);

    public void handleRequest(@NotNull Woman woman) {
        if (woman.getStatus().equals(this.status.name())) {
            this.response(woman);
        } else {
            if (this.nextHandle != null) {
                this.nextHandle.handleRequest(woman);
            } else {
                throw new IllegalStateException("处理不了");
            }
        }

    }
}
