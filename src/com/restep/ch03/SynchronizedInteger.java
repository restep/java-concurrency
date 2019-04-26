package com.restep.ch03;

/**
 * @author restep
 * @date 2019/3/13
 */
public class SynchronizedInteger {
    private int value;

    public synchronized int get() {
        return value;
    }

    public synchronized void set(int value) {
        this.value = value;
    }
}
