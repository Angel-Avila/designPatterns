package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 9/15/16.
 */
public class VolleyballBallTest {
    @Test
    public void testVolleyballBallTest() {
        VolleyballBall volleyballBall = new VolleyballBall();
        assertEquals("I'm bouncing normally!", volleyballBall.performBounce());
        assertEquals("I'm deflating!", volleyballBall.performDeflate());
        assertEquals("I'm inflating!", volleyballBall.performInflate());
        assertEquals("I can't break!", volleyballBall.performBreak());
        assertEquals("I'm floating", volleyballBall.performflotate());
        assertEquals("Volleyball ball is rolling!", volleyballBall.roll());
    }
}
