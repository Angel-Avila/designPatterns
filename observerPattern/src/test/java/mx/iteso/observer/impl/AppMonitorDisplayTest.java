package mx.iteso.observer.impl;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Created by Angel on 9/22/16.
 */
public class AppMonitorDisplayTest {
    private AppMonitorDisplay appMonitorDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        appMonitorDisplay = new AppMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        appMonitorDisplay.update("homeTeam", "awayTeam", 1, 0);
        //Nothing to assert or verify for now
    }
}
