package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 9/15/2016.
 */
public class LifeSaversCandiesTest {
    @Test
    public void LifeSaversCandysTest(){
        LifeSaversCandies lifeSaversCandies = new LifeSaversCandies();
        assertEquals("I'm deflating!", lifeSaversCandies.performDeflate());
        assertEquals("I'm inflating!", lifeSaversCandies.performInflate());
        assertEquals("I'm Drowning", lifeSaversCandies.performflotate());
    }
}
