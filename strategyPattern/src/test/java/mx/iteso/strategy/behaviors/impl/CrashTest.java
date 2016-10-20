package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrashTest {
    @Test
    public void testCrashBounce() {
        Crash crash = new Crash();
        assertEquals("I crashed!! I can't bounce", crash.bounce());
    }
}
