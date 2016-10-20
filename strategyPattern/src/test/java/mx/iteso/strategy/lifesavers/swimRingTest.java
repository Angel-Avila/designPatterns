package mx.iteso.strategy.lifesavers;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 9/15/2016.
 */
public class swimRingTest {
    @Test
    public void RingTest(){
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm deflating!", swimRing.performDeflate());
        assertEquals("I'm inflating!", swimRing.performInflate());
        assertEquals("I'm floating", swimRing.performflotate());
    }
}
