package mx.iteso.factory;

import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 10/8/16.
 */
public class MenudoStoreTest {

    MenudoStore menudoStore;

    @Before
    public void setup() {
        menudoStore = new MenudoStore();
    }

    @Test
    public void testOrderMenudo() {
        Pozole pozole = menudoStore.orderPozole("");
        assertEquals("Menudo", pozole.getName());
    }

}
