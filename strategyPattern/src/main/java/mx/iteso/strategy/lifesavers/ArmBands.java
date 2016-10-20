package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotable;


public class ArmBands extends Lifesaver{

    public ArmBands() {
        deflateBehavior = new Deflatable();
        flotateBehavior = new Flotable();
        type = "Arm bands";
    }

}
