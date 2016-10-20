package mx.iteso.factory;

public abstract class PozoleStore {

    public Pozole orderPozole(String meat){
        Pozole pozole;

        pozole = createPozole(meat);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected abstract Pozole createPozole(String meat);
}