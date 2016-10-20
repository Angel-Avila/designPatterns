package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

/**
 * Created by lamos and Angel on 10/6/2016.
 */
public class AnyKindPozoleStore  {

    public Pozole orderPozole(String meat, String broth){
        Pozole pozole;

        pozole = createPozole(meat, broth);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected Pozole createPozole(String meat, String broth) {
        if(broth.equals("Caldo Blanco"))
            return new PozoleBlancoStore().createPozole(meat);
        else if(broth.equals("Caldo Verde"))
            return new PozoleVerdeStore().createPozole(meat);
        else if(broth.equals("Caldo Rojo"))
            return new PozoleRojoStore().createPozole(meat);
        else if(broth.equals("Caldo Pozolillo"))
            return new PozolilloStore().createPozole(meat);
        else if(broth.equals("Caldo Menudo"))
            return new MenudoStore().createPozole(meat);

        return null;
    }

}
