package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 9/15/16.
 */
public class GolfballTest {
    @Test
    public void testGolfBallTest() {
        GolfBall golfBall = new GolfBall();
        assertEquals("I'm bouncing irregularly!", golfBall.performBounce());
        assertEquals("I can't deflate!", golfBall.performDeflate());
        assertEquals("I can't inflate!", golfBall.performInflate());
        assertEquals("I just broke in half!", golfBall.performBreak());
        assertEquals("I'm Drowning", golfBall.performflotate());
        assertEquals("Golfball ball is rolling!", golfBall.roll());
    }
}
