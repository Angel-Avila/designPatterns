package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lamos on 9/15/2016.
 */
public class SwimSeatTest {
    @Test
    public void SeatTest(){
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm deflating!", swimSeat.performDeflate());
        assertEquals("I'm inflating!", swimSeat.performInflate());
        assertEquals("I'm Drowning", swimSeat.performflotate());
    }

}
