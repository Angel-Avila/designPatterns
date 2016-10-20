package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 9/15/16.
 */
public class SoccerBallTest {
    @Test
    public void testSoccerBallTest() {
        SoccerBall soccerBall = new SoccerBall();
        assertEquals("I'm bouncing normally!", soccerBall.performBounce());
        assertEquals("I'm deflating!", soccerBall.performDeflate());
        assertEquals("I'm inflating!", soccerBall.performInflate());
        assertEquals("I can't break!", soccerBall.performBreak());
        assertEquals("I'm floating", soccerBall.performflotate());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}
