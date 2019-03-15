package com.restep.ch07;

import java.util.concurrent.*;

import static com.restep.ch05.LaunderThrowable.launderThrowable;

/**
 * @author restep
 * @date 2019/3/15
 */
public class TimedRun {
    private static final ExecutorService taskExec = Executors.newCachedThreadPool();

    public static void timedRun(Runnable r, long timeout, TimeUnit unit) throws InterruptedException {
        Future<?> task = taskExec.submit(r);
        try {
            task.get(timeout, unit);
        } catch (TimeoutException e) {
        } catch (ExecutionException e) {
            throw launderThrowable(e.getCause());
        } finally {
            task.cancel(true);
        }
    }
}
