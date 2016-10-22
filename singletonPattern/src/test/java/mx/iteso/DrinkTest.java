package mx.iteso;
import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by lamos on 10/22/2016.
 */
public class DrinkTest {
    private Drink drink;

    @Before
    public void setup(){
        drink = new Drink();
        drink.setWaiter("Hector");
        drink.setName("PerroNegro");
        drink.setPrice(50);
        drink.setDescription("Cerveza Artesanal");
    }
    @Test
    public void testGetWaiter(){
        assertEquals("Hector",drink.getWaiter());
    }

    @Test
    public void testGetName(){
        assertEquals("PerroNegro",drink.getName());
    }
    @Test
    public void testGetPrice(){
        assertEquals(50, drink.getPrice(),0);
    }

    @Test
    public void testGetDescription(){
        assertEquals("Cerveza Artesanal",drink.getDescription());
    }
}
