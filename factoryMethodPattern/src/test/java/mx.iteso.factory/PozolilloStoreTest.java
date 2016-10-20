package mx.iteso.factory;

import mx.iteso.factory.stores.PozolilloStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 10/8/16.
 */
public class PozolilloStoreTest {

    PozolilloStore pozolilloStore;

    @Before
    public void setup() {
        pozolilloStore = new PozolilloStore();
    }

    @Test
    public void testOrderPozolillo() {
        Pozole pozolillo = pozolilloStore.orderPozole("");
        assertEquals("Pozolillo", pozolillo.getName());
    }
}
