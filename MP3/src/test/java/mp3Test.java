import iteso.mx.MP3.Mp3Context;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by lamos on 11/19/2016.
 */
public class mp3Test {

    private Mp3Context mp3;

    @Before
    public void setup() {
        // Starts on stand by
        mp3 = Mp3Context.getMp3Instance();
    }

    @Test
    public void testButtons() {
        // Stand by to pause
        assertEquals("Already on stand by", mp3.standBy());
        assertEquals("Can't play from stand by", mp3.play());
        assertEquals("Pausing", mp3.pause());

        // Pause to play
        assertEquals("Already paused", mp3.pause());
        assertEquals("Can't stand by while on pause", mp3.standBy());
        assertEquals("Un-pausing song", mp3.play());

        // Play to stan by
        assertEquals("Already playing", mp3.play());
        assertEquals("Can't pause while playing (don't ask)", mp3.pause());
        assertEquals("Standing by", mp3.standBy());
    }

}
