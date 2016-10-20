package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 9/15/16.
 */
public class TennisBallTest {
    @Test
    public void testTennisBallTest() {
        TennisBall tennisBall = new TennisBall();
        assertEquals("I'm bouncing normally!", tennisBall.performBounce());
        assertEquals("I can't deflate!", tennisBall.performDeflate());
        assertEquals("I can't inflate!", tennisBall.performInflate());
        assertEquals("I can't break!", tennisBall.performBreak());
        assertEquals("I'm floating", tennisBall.performflotate());
        assertEquals("Tennisball ball is rolling!", tennisBall.roll());
    }
}
