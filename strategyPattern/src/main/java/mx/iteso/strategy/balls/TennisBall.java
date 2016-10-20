package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Flotable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotBreakable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Angel on 9/15/16.
 */
public class TennisBall extends Ball {
    public TennisBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        breakBehaviour = new NotBreakable();
        flotateBehavior = new Flotable();
        type = "Tennisball ball";
    }
}
