package mx.iteso;
import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by lamos on 10/22/2016.
 */
public class DishTest {
    private Dish dish;

    @Before
    public void setup(){
        dish = new Dish();
        dish.setWaiter("Angel");
        dish.setName("CarneDePerro");
        dish.setPrice(100);
        dish.setDescription("Exquisita Carne");
    }

    @Test
    public void testGetWaiter(){
        assertEquals("Angel",dish.getWaiter());
    }

    @Test
    public void testGetName(){
        assertEquals("CarneDePerro",dish.getName());
    }
    @Test
    public void testGetPrice(){
        assertEquals(100,dish.getPrice(),0);
    }

    @Test
    public void testGetDescription(){
        assertEquals("Exquisita Carne",dish.getDescription());
    }
}

