package com.restep.ch04;

import java.util.HashSet;
import java.util.Set;

/**
 * @author restep
 * @date 2019/3/14
 */
public class PersonSet {
    private final Set<Person> mySet = new HashSet<>();

    public synchronized void addPerson(Person p) {
        mySet.add(p);
    }

    public synchronized boolean containsPerson(Person p) {
        return mySet.contains(p);
    }

    interface Person {

    }
}
