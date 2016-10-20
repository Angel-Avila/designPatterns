package mx.iteso.factory;

import mx.iteso.factory.stores.PozoleVerdeStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 10/8/16.
 */
public class PozoleVerdeStoreTest {

    PozoleVerdeStore pozoleVerdeStore;

    @Before
    public void setup() {
        pozoleVerdeStore = new PozoleVerdeStore();
    }

    @Test
    public void testOrderPozoleVerdeCachete() {
        Pozole pozole = pozoleVerdeStore.orderPozole("cachete");
        assertEquals("Pozole Verde con Cachete", pozole.getName());
    }

    @Test
    public void testOrderPozoleVerdePollo() {
        Pozole pozole = pozoleVerdeStore.orderPozole("pollo");
        assertEquals("Pozole Verde con Pollo", pozole.getName());
    }

    @Test
    public void testOrderPozoleVerdeOreja() {
        Pozole pozole = pozoleVerdeStore.orderPozole("oreja");
        assertEquals("Pozole Verde con Oreja", pozole.getName());
    }

    @Test
    public void testOrderPozoleVerdePierna() {
        Pozole pozole = pozoleVerdeStore.orderPozole("pierna");
        assertEquals("Pozole Verde con Pierna", pozole.getName());
    }

    @Test
    public void testOrderPozoleVerdeTrompa() {
        Pozole pozole = pozoleVerdeStore.orderPozole("trompa");
        assertEquals("Pozole Verde con Trompa", pozole.getName());
    }
}
