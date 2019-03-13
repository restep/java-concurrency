package com.restep.ch03;

/**
 * @author restep
 * @date 2019/3/13
 */
public class CountingSheep {
    volatile boolean asleep;

    void tryToSleep() {
        while (!asleep) {
            countSomeSheep();
        }
    }

    void countSomeSheep() {

    }
}
