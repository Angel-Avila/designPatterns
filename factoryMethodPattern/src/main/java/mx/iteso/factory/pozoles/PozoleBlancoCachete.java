package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by lamos on 10/6/2016.
 */
public class PozoleBlancoCachete extends Pozole {
    public PozoleBlancoCachete() {
        name = "Pozole Blanco con Cachete";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
