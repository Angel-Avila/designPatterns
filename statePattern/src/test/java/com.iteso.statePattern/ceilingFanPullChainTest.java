package com.iteso.statePattern;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 11/16/16.
 */
public class ceilingFanPullChainTest {

    private CeilingFanPullChain ceilingFanPullChain;
    private State stateOff;

    @Before
    public void setup() {
        stateOff = new Off();
        ceilingFanPullChain = new CeilingFanPullChain();
    }

    @Test
    public void testPullChain() {
        ceilingFanPullChain.set_state(stateOff);
        assertEquals("Low", ceilingFanPullChain.pull());
        assertEquals("Medium", ceilingFanPullChain.pull());
        assertEquals("High", ceilingFanPullChain.pull());
        assertEquals("Off", ceilingFanPullChain.pull());
    }
}
