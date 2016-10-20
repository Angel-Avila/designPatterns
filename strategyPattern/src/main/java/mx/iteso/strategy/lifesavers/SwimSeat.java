package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.FlotateBehavior;
import mx.iteso.strategy.behaviors.impl.NotFlotable;

public class SwimSeat extends Lifesaver {
    public SwimSeat()
    {
        deflateBehavior = new Deflatable();
        flotateBehavior = new NotFlotable();
        type = "Swim seat";
    }
}
