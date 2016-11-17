package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Angel on 10/31/16.
 */
public class VideoGameFacadeTest {

    private VideoGameFacade vgFacade;
    private GameConsole ps3;
    private GameConsole xbox;
    private GameController dualShock;
    private Lights lights;
    private Router linksys;
    private SoundSystem bose;
    private TV tv;
    @Before
    public void setup() {
        ps3 = new PS3();
        xbox = new XBOX();
        dualShock = new DualShock();
        lights = new EcoLights();
        linksys = new Linksys();
        bose = new Bose();
        tv = new SonyBravia();
        vgFacade = new VideoGameFacade(tv, ps3, dualShock, bose, linksys, lights);
    }

    @Test
    public void testPlayGame() {
        vgFacade.playOnlineGame("Code Wars 3");
    }

}
