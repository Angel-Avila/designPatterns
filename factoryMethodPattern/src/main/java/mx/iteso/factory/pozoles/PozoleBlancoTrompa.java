package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by lamos on 10/6/2016.
 */
public class PozoleBlancoTrompa extends Pozole {
    public PozoleBlancoTrompa() {
        name = "Pozole Blanco con Trompa";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
