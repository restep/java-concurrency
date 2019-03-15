package com.restep.ch06;

import java.util.concurrent.Executor;

/**
 * @author restep
 * @date 2019/3/15
 */
public class WithinThreadExecutor implements Executor {
    @Override
    public void execute(Runnable r) {
        r.run();
    }
}
