package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 9/15/2016.
 */
public class FoamFloatsTest {
    @Test
    public void FoamFloatTest(){
        FoamFloats foamFloats = new FoamFloats();
        assertEquals("I'm deflating!", foamFloats.performDeflate());
        assertEquals("I'm inflating!", foamFloats.performInflate());
        assertEquals("I'm floating", foamFloats.performflotate());
    }
}
