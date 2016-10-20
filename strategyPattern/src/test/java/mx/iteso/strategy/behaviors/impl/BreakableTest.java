package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 9/15/2016.
 */
public class BreakableTest {

    @Test
    public void testBreakable() {
            Breakable breakable = new Breakable();
            assertEquals("I just broke in half!", breakable.breakBall());
    }

    @Test
    public void testUnbreakable(){
        NotBreakable notBreakable = new NotBreakable();
        assertEquals("I can't break!",notBreakable.breakBall());
    }

}
