package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotateBehavior;

public abstract class Lifesaver {
    public String type;

    public FlotateBehavior flotateBehavior;
    public DeflateBehavior deflateBehavior;



public Lifesaver() {
}

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performflotate() { return flotateBehavior.floating();}
    public String display() {
        return "I'm a " + type;
    }
}