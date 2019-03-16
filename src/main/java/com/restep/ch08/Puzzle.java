package com.restep.ch08;

import java.util.Set;

/**
 * @author restep
 * @date 2019/3/16
 */
public interface Puzzle <P, M> {
    P initialPosition();

    boolean isGoal(P position);

    Set<M> legalMoves(P position);

    P move(P position, M move);
}
