package mx.iteso;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.tables.Table4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 10/22/2016.
 */
public class Table4Test {
    private Table4 table;
    private Drink drink, drink1;
    private Dish dish, dish1;


    @Before
    public void SetUp() {
        table = (Table4) table.getInstance();
        table.tableName = "table4";
        drink = new Drink();
        drink1 = new Drink();
        dish = new Dish();
        dish1 = new Dish();


    }

    @Test
    public void NuevoDishTest() {
        dish.setWaiter("Angel");
        dish.setName("CarneDePerro");
        dish.setPrice(100);
        dish1.setWaiter(("Hector"));
        dish1.setName("CarneDeRata");
        dish1.setPrice(10);
        table.addDish(dish);
        table.addDish(dish1);
        assertEquals("Check for table4\nDrinks:\nDishes:\nAngel: CarneDePerro 100.0\n" + "Hector: CarneDeRata 10.0\nTotal: $110.0", table.printCheck());
    }

    @Test
    public void NuevoDrinkTest() {
        drink.setWaiter("Angel");
        drink.setName("Miller");
        drink.setPrice(40);
        drink1.setWaiter(("Hector"));
        drink1.setName("PerroNegro");
        drink1.setPrice(50);
        table.addDrink(drink);
        table.addDrink(drink1);
        assertEquals("Check for table4\nDrinks:\nAngel: Miller 40.0\n" + "Hector: PerroNegro 50.0" + "\nDishes:\nTotal: $90.0", table.printCheck());
    }

    @After
    public void clearOrder() {
        table.clearOrder();
        table.clearDishes();
        table.clearDrinks();
    }
}


