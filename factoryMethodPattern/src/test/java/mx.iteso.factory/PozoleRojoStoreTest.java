package mx.iteso.factory;

import mx.iteso.factory.stores.PozoleRojoStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 10/8/16.
 */
public class PozoleRojoStoreTest {

    PozoleRojoStore pozoleRojoStore;

    @Before
    public void setup() {
        pozoleRojoStore = new PozoleRojoStore();
    }

    @Test
    public void testOrderPozoleRojoCachete() {
        Pozole pozole = pozoleRojoStore.orderPozole("cachete");
        assertEquals("Pozole Rojo con Cachete", pozole.getName());
    }

    @Test
    public void testOrderPozoleRojoPollo() {
        Pozole pozole = pozoleRojoStore.orderPozole("pollo");
        assertEquals("Pozole Rojo con Pollo", pozole.getName());
    }

    @Test
    public void testOrderPozoleRojoOreja() {
        Pozole pozole = pozoleRojoStore.orderPozole("oreja");
        assertEquals("Pozole Rojo con Oreja", pozole.getName());
    }

    @Test
    public void testOrderPozoleRojoPierna() {
        Pozole pozole = pozoleRojoStore.orderPozole("pierna");
        assertEquals("Pozole Rojo con Pierna", pozole.getName());
    }

    @Test
    public void testOrderPozoleRojoTrompa() {
        Pozole pozole = pozoleRojoStore.orderPozole("trompa");
        assertEquals("Pozole Rojo con Trompa", pozole.getName());
    }
}
