package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball basket = new BaseballBall();
        Ball bowling = new BowlingBall();
        Ball golf = new GolfBall();
        Ball tennis = new TennisBall();
        Ball volley = new VolleyballBall();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performBreak());
        System.out.println(soccer.performflotate());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.performBreak());
        System.out.println(american.performflotate());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.performBreak());
        System.out.println(base.performflotate());

        System.out.println();

        System.out.println(basket.roll());
        System.out.println(basket.performBounce());
        System.out.println(basket.performDeflate());
        System.out.println(basket.performInflate());
        System.out.println(basket.performBreak());
        System.out.println(basket.performflotate());

        System.out.println();

        System.out.println(bowling.roll());
        System.out.println(bowling.performBounce());
        System.out.println(bowling.performDeflate());
        System.out.println(bowling.performInflate());
        System.out.println(bowling.performBreak());
        System.out.println(bowling.performflotate());

        System.out.println();

        System.out.println(golf.roll());
        System.out.println(golf.performBounce());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());
        System.out.println(golf.performBreak());
        System.out.println(golf.performflotate());

        System.out.println();

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(tennis.performBreak());
        System.out.println(tennis.performflotate());

        System.out.println();

        System.out.println(volley.roll());
        System.out.println(volley.performBounce());
        System.out.println(volley.performDeflate());
        System.out.println(volley.performInflate());
        System.out.println(volley.performBreak());
        System.out.println(volley.performflotate());
    }
}
