package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotable;

/**
 * Created by lamos on 9/15/2016.
 */
public class WaterTubes extends Lifesaver {
    public WaterTubes()
    {
        deflateBehavior = new Deflatable();
        flotateBehavior = new Flotable();
        type = "Water Tubes";
    }
}
