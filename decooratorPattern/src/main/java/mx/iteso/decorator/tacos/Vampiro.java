package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Size;
import mx.iteso.decorator.Taco;

/**
 * Created by Angel on 9/29/16.
 */
public class Vampiro extends Taco {
    public Vampiro() {
        description = "Vampiro";
        size = Size.REGULAR;
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
