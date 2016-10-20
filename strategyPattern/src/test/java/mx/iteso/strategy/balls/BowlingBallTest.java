package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 9/15/16.
 */
public class BowlingBallTest {
    @Test
    public void testBowlingBallTest() {
        BowlingBall bowlingBall = new BowlingBall();
        assertEquals("I'm bouncing irregularly!", bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("I can't inflate!", bowlingBall.performInflate());
        assertEquals("I just broke in half!", bowlingBall.performBreak());
        assertEquals("I'm Drowning", bowlingBall.performflotate());
        assertEquals("Bowlingball ball is rolling!", bowlingBall.roll());
    }
}
