package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 9/15/2016.
 */
public class ArmBandsTest {
    @Test
    public void ArmBandsTest(){
        ArmBands armBands = new ArmBands();
        assertEquals("I'm deflating!", armBands.performDeflate());
        assertEquals("I'm inflating!", armBands.performInflate());
        assertEquals("I'm floating", armBands.performflotate());
    }

}
