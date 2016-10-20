package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.FlotateBehavior;
import mx.iteso.strategy.behaviors.impl.*;

/**
 * Created by Angel on 9/15/16.
 */
public class GolfBall extends Ball {
    public GolfBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        breakBehaviour = new Breakable();
        flotateBehavior = new NotFlotable();
        type = "Golfball ball";
    }
}
