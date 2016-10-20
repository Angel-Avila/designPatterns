package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotable;

/**
 * Created by lamos on 9/15/2016.
 */
public class LifeVests extends Lifesaver {
    public LifeVests()
    {
        deflateBehavior = new Deflatable();
        flotateBehavior = new Flotable();
        type = "Life Vests";
    }
}
