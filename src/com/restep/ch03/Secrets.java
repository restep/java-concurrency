package com.restep.ch03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author restep
 * @date 2019/3/13
 */
public class Secrets {
    public static Set<Secret> knownSecrets;

    public void initialize() {
        knownSecrets = new HashSet<Secret>();
    }
}

class Secret {

}
