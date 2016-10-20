package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeflatableTest {
    @Test
    public void testDeflatableDeflate() {
        Deflatable deflatable = new Deflatable();
        assertEquals("I'm deflating!",deflatable.deflate());

    }

    @Test
    public void testDeflatableInflate() {
        Deflatable deflatable = new Deflatable();
        assertEquals("I'm inflating!",deflatable.inflate());

    }
}
