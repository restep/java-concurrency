package com.restep.ch04;

import com.restep.ch02.Widget;

/**
 * @author restep
 * @date 2019/3/14
 */
public class PrivateLock {
    private final Object myLock = new Object();
    Widget widget;

    void someMethod() {
        synchronized (myLock) {
            // Access or modify the state of widget
        }
    }
}
