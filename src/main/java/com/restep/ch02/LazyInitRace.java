package com.restep.ch02;

/**
 * @author restep
 * @date 2019/3/13
 */
public class LazyInitRace {
    private ExpensiveObject instance = null;

    public ExpensiveObject getInstance() {
        if (null == instance) {
            instance = new ExpensiveObject();
        }

        return instance;
    }
}

class ExpensiveObject {

}
