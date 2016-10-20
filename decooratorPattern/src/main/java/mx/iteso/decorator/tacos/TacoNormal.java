package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Size;
import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(){
        description = "Taco normal";
        size = Size.REGULAR;
    }

    public TacoNormal(Size size){
        description = "Taco normal";
        this.size = size;
    }

    @Override
    public double cost() {
        if(size == Size.MEGA)
            return 10.00;
        if(size == Size.MINI)
            return 6.00;
        return 8.00;
    }
}
