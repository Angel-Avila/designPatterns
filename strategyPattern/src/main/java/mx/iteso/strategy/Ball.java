package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.BreakBehaviour;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotateBehavior;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public BreakBehaviour breakBehaviour;
    public FlotateBehavior flotateBehavior;
    public String type;

    public Ball() {
    }

    public String roll() {
        return type + " is rolling!";
    }

    public void setBounceBehavior(BounceBehavior bounceBehavior) {this.bounceBehavior = bounceBehavior;}

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performBreak() { return breakBehaviour.breakBall();}

    public String performflotate() { return flotateBehavior.floating();}
}
