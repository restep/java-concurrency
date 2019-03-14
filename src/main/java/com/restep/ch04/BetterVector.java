package com.restep.ch04;

import java.util.Vector;

/**
 * @author restep
 * @date 2019/3/14
 */
public class BetterVector<T> extends Vector<T> {
    static final long serialVersionUID = -3963416950630760754L;

    public synchronized boolean putIfAbsent(T x) {
        boolean absent = !contains(x);
        if (absent) {
            add(x);
        }

        return absent;
    }
}
