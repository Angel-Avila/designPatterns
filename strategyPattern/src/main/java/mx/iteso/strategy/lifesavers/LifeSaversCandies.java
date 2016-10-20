package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NotFlotable;
import mx.iteso.strategy.behaviors.FlotateBehavior;

/**
 * Created by lamos on 9/15/2016.
 */
public class LifeSaversCandies extends Lifesaver{
    public LifeSaversCandies()
    {
        deflateBehavior = new Deflatable();
        flotateBehavior = new NotFlotable();
        type = "LifeSavers Candies";
    }
}
