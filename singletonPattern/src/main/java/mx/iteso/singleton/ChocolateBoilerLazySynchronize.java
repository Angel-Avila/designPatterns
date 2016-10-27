package mx.iteso.singleton;

/**
 * Created by Angel on 10/22/16.
 */
public class ChocolateBoilerLazySynchronize {

    private static ChocolateBoilerLazySynchronize instance = null;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerLazySynchronize() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoilerLazySynchronize getInstance() {
        if(instance == null) instance = new ChocolateBoilerLazySynchronize();
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fi ll the boiler with a milk/chocolate mixture
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}