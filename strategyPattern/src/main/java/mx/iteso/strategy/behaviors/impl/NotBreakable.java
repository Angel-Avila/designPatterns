package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BreakBehaviour;

/**
 * Created by Angel on 9/15/16.
 */
public class NotBreakable implements BreakBehaviour {
    public String breakBall() {
        return "I can't break!";
    }
}
