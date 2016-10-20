package mx.iteso.factory;

import java.util.ArrayList;

public abstract class Pozole {
    public String name;
    public String broth;
    public ArrayList toppings = new ArrayList();


    public void serve() {
        System.out.println("Serving in regular pozole plate..." );
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding corn kernels..." );
        System.out.println("Adding broth..." );
        System.out.println("Adding toppings:" );
        for (int i = 0; i < toppings.size(); i++){
            System.out.println("    " + toppings.get(i));
        }

    }
    public String getName(){
        return name;
    }
}