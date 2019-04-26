package com.restep.ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author restep
 * @date 2019/3/14
 */
public class BadListHelper<T> {
    public List<T> list = Collections.synchronizedList(new ArrayList<T>());

    public synchronized boolean putIfAbsent(T x) {
        boolean absent = !list.contains(x);
        if (absent) {
            list.add(x);
        }

        return absent;
    }
}
