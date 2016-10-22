package mx.iteso.singleton;

import java.util.ArrayList;

public abstract class TableOrder {
    public ArrayList dishes;
    public ArrayList drinks;
    public String tableName;

    public void clearDrinks(){
        drinks.clear();
    }

    public void clearDishes(){
        dishes.clear();
    }

    public void addDrink (Drink drink) {
        drinks.add(drink);
    }
    public void addDish (Dish dish) {
        dishes.add(dish);
    }

    public String printCheck(){
        String Print = "";
        float total = 0;
        Drink dr;
        Dish ds;
        int i;
        Print += "Check for " + tableName;
        Print += "\nDrinks:\n";
        for (i = 0; i < drinks.size(); i++){
            dr = (Drink) drinks.get(i);
            Print += dr.getWaiter() + ": " + dr.getName()+ " " + dr.getPrice() + "\n";
            total += dr.getPrice();
        }
        Print += "Dishes:\n";
        for (i = 0; i < dishes.size(); i++){
            ds = (Dish) dishes.get(i);
            Print += ds.getWaiter() + ": " + ds.getName()+ " " + ds.getPrice() + "\n";
            total += ds.getPrice();
        }
        Print += "Total: $" + total;

        return Print;
    }


}

