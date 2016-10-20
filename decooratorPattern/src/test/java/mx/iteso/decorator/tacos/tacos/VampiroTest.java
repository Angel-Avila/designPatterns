package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Camaron;
import mx.iteso.decorator.condiments.meat.Pescado;
import mx.iteso.decorator.tacos.Vampiro;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 10/1/16.
 */
public class VampiroTest {
    @Test
    public void testCost() {
        Taco taco = new Vampiro();
        assertEquals(10.0, taco.cost(), 0);
    }

    @Test
    public void testCostCamaronPescado() {
        try {
            Taco taco = new Vampiro();
            taco = new Camaron(taco);
            taco = new Pescado(taco);
            assertEquals(21.0, taco.cost(), 0);
        } catch(Exception e) {

        }

    }
}
