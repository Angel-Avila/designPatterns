package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class BaseballBall extends Ball {
    public BaseballBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        breakBehaviour = new Breakable();
        flotateBehavior = new NotFlotable();
        type = "Baseball ball";
    }
}
