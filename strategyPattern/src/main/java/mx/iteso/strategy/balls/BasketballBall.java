package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotBreakable;

/**
 * Created by Angel on 9/15/16.
 */
public class BasketballBall extends Ball {
    public BasketballBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        breakBehaviour = new NotBreakable();
        flotateBehavior = new Flotable();
        type = "Basketball ball";
    }
}
