package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

/**
 * Created by Angel on 9/15/16.
 */
public class VolleyballBall extends Ball {
    public VolleyballBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        breakBehaviour = new NotBreakable();
        flotateBehavior = new Flotable();
        type = "Volleyball ball";
    }
}
