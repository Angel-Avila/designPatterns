package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";
    public Size size = Size.REGULAR;
    public String getDescription() {
        if(size == Size.REGULAR)
            return description + " regular";
        else if(size == Size.MEGA)
            return description + " mega";
        else
            return description + " mini";
    }
    public abstract double cost();
}
