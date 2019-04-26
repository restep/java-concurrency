package com.restep.ch08;

import java.util.concurrent.ThreadFactory;

/**
 * @author restep
 * @date 2019/3/16
 */
public class MyThreadFactory implements ThreadFactory {
    private final String poolName;

    public MyThreadFactory(String poolName) {
        this.poolName = poolName;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        return new MyAppThread(runnable, poolName);
    }
}
