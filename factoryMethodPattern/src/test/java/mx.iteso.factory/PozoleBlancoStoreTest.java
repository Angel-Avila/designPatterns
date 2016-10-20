package mx.iteso.factory;

import mx.iteso.factory.stores.PozoleBlancoStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 10/8/16.
 */
public class PozoleBlancoStoreTest {

    PozoleBlancoStore pozoleBlancoStore;

    @Before
    public void setup() {
        pozoleBlancoStore = new PozoleBlancoStore();
    }

    @Test
    public void testOrderPozoleBlancoCachete() {
        Pozole pozole = pozoleBlancoStore.orderPozole("cachete");
        assertEquals("Pozole Blanco con Cachete", pozole.getName());
    }

    @Test
    public void testOrderPozoleBlancoPollo() {
        Pozole pozole = pozoleBlancoStore.orderPozole("pollo");
        assertEquals("Pozole Blanco con Pollo", pozole.getName());
    }

    @Test
    public void testOrderPozoleBlancoOreja() {
        Pozole pozole = pozoleBlancoStore.orderPozole("oreja");
        assertEquals("Pozole Blanco con Oreja", pozole.getName());
    }

    @Test
    public void testOrderPozoleBlancoPierna() {
        Pozole pozole = pozoleBlancoStore.orderPozole("pierna");
        assertEquals("Pozole Blanco con Pierna", pozole.getName());
    }

    @Test
    public void testOrderPozoleBlancoTrompa() {
        Pozole pozole = pozoleBlancoStore.orderPozole("trompa");
        assertEquals("Pozole Blanco con Trompa", pozole.getName());
    }
}
