package com.restep.ch02;

/**
 * @author restep
 * @date 2019/3/13
 */
public class Widget {
    public synchronized void doSomething() {

    }
}

class LoggingWidget extends Widget {
    @Override
    public synchronized void doSomething() {
        super.doSomething();
    }
}
