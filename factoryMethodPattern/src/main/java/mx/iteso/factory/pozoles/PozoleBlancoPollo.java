package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by lamos on 10/6/2016.
 */
public class PozoleBlancoPollo extends Pozole {
    public PozoleBlancoPollo() {
        name = "Pozole Blanco con Pollo";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
