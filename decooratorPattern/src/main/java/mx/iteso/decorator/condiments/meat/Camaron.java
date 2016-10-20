package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Size;
import mx.iteso.decorator.Taco;

/**
 * Created by lamos on 9/29/2016.
 */
public class Camaron extends CondimentsDecorator {
    Taco taco;

    public Camaron(Taco taco) throws Exception {
        this.taco = taco;
        this.size = taco.size;
        if(taco.size == Size.MINI)
            throw new Exception("no existe el taco de camaron mini");
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de Camaron";
    }

    @Override
    public double cost() {
        if (size == Size.MEGA)
            return 6.00 + taco.cost();
        if (size == Size.REGULAR)
        return 5.00 + taco.cost();
        return 0;
    }
}