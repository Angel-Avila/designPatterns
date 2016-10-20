package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ScoresDataTest {
    ScoresData scoresData;
    Observer observer;
    Scorer scorer1;
    Scorer scorer2;

    @Before
    public void setUp() {
        scoresData = new ScoresData();
        observer = mock(Observer.class);
        scorer1 = new Scorer("Scorer", 1, "Position", "testTeam");
        scorer2 = new Scorer("Scorer", 1, "Position", "testTeam2");
        when(observer.shouldNotify()).thenReturn(true);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testRegisterAndRemoveObserver() {
        scoresData.registerObserver(observer);
        scoresData.removeObserver(observer);
        scoresData.removeObserver(observer);
    }

    @Test
    public void testSetScore() {
        scoresData.registerObserver(observer);
        scoresData.registerObserver(observer);
        scoresData.setScore("testTeam", "testTeam2", 0, 0);
        verify(observer, times(2)).update("testTeam", "testTeam2", 0, 0);
    }

    @Test
    public void testGoalScored() {
        scoresData.registerObserver(observer);
        scoresData.registerObserver(observer);
        scoresData.setTeams("testTeam", "testTeam2");
        scoresData.goalScored(scorer1);
        scoresData.goalScored(scorer2);
        scoresData.notifyObservers();
        verify(observer, times(2)).update(anyString(), anyString(), anyInt(), anyInt());
    }

    @Test
    public void testTurnNotificationsOff() {
        scoresData.registerObserver(observer);
        observer.turnNotificationsOff();
        when(observer.shouldNotify()).thenReturn(false);
        scoresData.setScore("testTeam", "testTeam2", 0, 0);
        verify(observer, never()).update(anyString(), anyString(), anyInt(), anyInt());
    }

}
