package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 9/15/2016.
 */
public class FlotableTest {
    @Test
    public void testFlotable() {
        Flotable flotable = new Flotable();
        assertEquals("I'm floating", flotable.floating());



    }
    @Test
    public void testNotFlotable(){
        NotFlotable notFlotable = new NotFlotable();
        assertEquals("I'm Drowning",notFlotable.floating());
    }
}
