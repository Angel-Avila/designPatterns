package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 9/15/16.
 */
public class BasketBallTest {
    @Test
    public void testBasketballBallTest() {
        BasketballBall basketballBall = new BasketballBall();
        assertEquals("I'm bouncing normally!", basketballBall.performBounce());
        assertEquals("I'm deflating!", basketballBall.performDeflate());
        assertEquals("I'm inflating!", basketballBall.performInflate());
        assertEquals("I can't break!", basketballBall.performBreak());
        assertEquals("I'm floating", basketballBall.performflotate());
        assertEquals("Basketball ball is rolling!", basketballBall.roll());
    }
}
