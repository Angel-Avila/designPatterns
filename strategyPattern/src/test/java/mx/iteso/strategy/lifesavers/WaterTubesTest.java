package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 9/15/2016.
 */
public class WaterTubesTest {
    @Test
    public void WaterTubeTest(){
        WaterTubes waterTubes = new WaterTubes();
        assertEquals("I'm deflating!", waterTubes.performDeflate());
        assertEquals("I'm inflating!", waterTubes.performInflate());
        assertEquals("I'm floating", waterTubes.performflotate());
    }
}
