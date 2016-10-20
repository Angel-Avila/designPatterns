package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Size;
import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(){
        description = "Quesadilla";
        size = Size.REGULAR;
    }

    public Quesadilla(Size size) {
        description = "Quesadilla";
        this.size = size;
    }

    @Override
    public double cost() {
        if(size == Size.MEGA)
            return 15.00;
        if(size == Size.MINI)
            return 8.00;
        return 10.00;
    }
}
