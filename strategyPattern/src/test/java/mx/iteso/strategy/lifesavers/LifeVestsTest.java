package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 9/15/2016.
 */
public class LifeVestsTest {
    @Test
    public void LifeVestTest(){
        LifeVests lifeVests = new LifeVests();
        assertEquals("I'm deflating!", lifeVests.performDeflate());
        assertEquals("I'm inflating!", lifeVests.performInflate());
        assertEquals("I'm floating", lifeVests.performflotate());
    }
}
