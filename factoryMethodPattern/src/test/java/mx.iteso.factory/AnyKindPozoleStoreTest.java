package mx.iteso.factory;

import mx.iteso.factory.stores.AnyKindPozoleStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 10/8/16.
 */
public class AnyKindPozoleStoreTest {

    AnyKindPozoleStore anyKindPozoleStore;

    @Before
    public void setup() {
        anyKindPozoleStore = new AnyKindPozoleStore();
    }

    @Test
    public void testOrderPozoleBlancoCachete() {
        Pozole pozole = anyKindPozoleStore.orderPozole("cachete", "Caldo Blanco");
        assertEquals("Pozole Blanco con Cachete", pozole.getName());
    }

    @Test
    public void testOrderPozoleBlancoPollo() {
        Pozole pozole = anyKindPozoleStore.orderPozole("pollo", "Caldo Blanco");
        assertEquals("Pozole Blanco con Pollo", pozole.getName());
    }

    @Test
    public void testOrderPozoleBlancoOreja() {
        Pozole pozole = anyKindPozoleStore.orderPozole("oreja", "Caldo Blanco");
        assertEquals("Pozole Blanco con Oreja", pozole.getName());
    }

    @Test
    public void testOrderPozoleBlancoPierna() {
        Pozole pozole = anyKindPozoleStore.orderPozole("pierna", "Caldo Blanco");
        assertEquals("Pozole Blanco con Pierna", pozole.getName());
    }

    @Test
    public void testOrderPozoleBlancoTrompa() {
        Pozole pozole = anyKindPozoleStore.orderPozole("trompa", "Caldo Blanco");
        assertEquals("Pozole Blanco con Trompa", pozole.getName());
    }

    @Test
    public void testOrderPozoleRojoCachete() {
        Pozole pozole = anyKindPozoleStore.orderPozole("cachete", "Caldo Rojo");
        assertEquals("Pozole Rojo con Cachete", pozole.getName());
    }

    @Test
    public void testOrderPozoleRojoPollo() {
        Pozole pozole = anyKindPozoleStore.orderPozole("pollo", "Caldo Rojo");
        assertEquals("Pozole Rojo con Pollo", pozole.getName());
    }

    @Test
    public void testOrderPozoleRojoOreja() {
        Pozole pozole = anyKindPozoleStore.orderPozole("oreja", "Caldo Rojo");
        assertEquals("Pozole Rojo con Oreja", pozole.getName());
    }

    @Test
    public void testOrderPozoleRojoPierna() {
        Pozole pozole = anyKindPozoleStore.orderPozole("pierna", "Caldo Rojo");
        assertEquals("Pozole Rojo con Pierna", pozole.getName());
    }

    @Test
    public void testOrderPozoleRojoTrompa() {
        Pozole pozole = anyKindPozoleStore.orderPozole("trompa", "Caldo Rojo");
        assertEquals("Pozole Rojo con Trompa", pozole.getName());
    }

    @Test
    public void testOrderPozoleVerdeCachete() {
        Pozole pozole = anyKindPozoleStore.orderPozole("cachete", "Caldo Verde");
        assertEquals("Pozole Verde con Cachete", pozole.getName());
    }

    @Test
    public void testOrderPozoleVerdePollo() {
        Pozole pozole = anyKindPozoleStore.orderPozole("pollo", "Caldo Verde");
        assertEquals("Pozole Verde con Pollo", pozole.getName());
    }

    @Test
    public void testOrderPozoleVerdeOreja() {
        Pozole pozole = anyKindPozoleStore.orderPozole("oreja", "Caldo Verde");
        assertEquals("Pozole Verde con Oreja", pozole.getName());
    }

    @Test
    public void testOrderPozoleVerdePierna() {
        Pozole pozole = anyKindPozoleStore.orderPozole("pierna", "Caldo Verde");
        assertEquals("Pozole Verde con Pierna", pozole.getName());
    }

    @Test
    public void testOrderPozoleVerdeTrompa() {
        Pozole pozole = anyKindPozoleStore.orderPozole("trompa", "Caldo Verde");
        assertEquals("Pozole Verde con Trompa", pozole.getName());
    }

    @Test
    public void testOrderMenudo() {
        Pozole pozole = anyKindPozoleStore.orderPozole("", "Caldo Menudo");
        assertEquals("Menudo", pozole.getName());
    }

    @Test
    public void testOrderPozolillo() {
        Pozole pozolillo = anyKindPozoleStore.orderPozole("", "Caldo Pozolillo");
        assertEquals("Pozolillo", pozolillo.getName());
    }
}
