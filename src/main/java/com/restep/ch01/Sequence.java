package com.restep.ch01;

/**
 * @author restep
 * @date 2019/3/13
 */
public class Sequence {
    private int value;

    public synchronized int getNext() {
        return value++;
    }
}
