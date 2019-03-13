package com.restep.ch01;

/**
 * @author restep
 * @date 2019/3/13
 */
public class UnsafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }
}
