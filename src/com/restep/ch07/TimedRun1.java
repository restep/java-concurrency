package com.restep.ch07;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author restep
 * @date 2019/3/15
 */
public class TimedRun1 {
    private static final ScheduledExecutorService cancelExec = Executors.newScheduledThreadPool(1);

    public static void timedRun(Runnable r, long timeout, TimeUnit unit) {
        final Thread taskThread = Thread.currentThread();
        cancelExec.schedule(new Runnable() {
            @Override
            public void run() {
                taskThread.interrupt();
            }
        }, timeout, unit);

        r.run();
    }
}
