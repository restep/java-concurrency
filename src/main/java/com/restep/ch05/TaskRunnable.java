package com.restep.ch05;

import java.util.concurrent.BlockingQueue;

/**
 * @author restep
 * @date 2019/3/15
 */
public class TaskRunnable implements Runnable {
    BlockingQueue<Task> queue;

    @Override
    public void run() {
        try {
            processTask(queue.take());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    void processTask(Task task) {

    }

    interface Task {

    }
}
