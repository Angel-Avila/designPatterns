package com.iteso.facade;

import com.iteso.facade.interfaces.*;

/**
 * Created by Angel on 10/27/16.
 */
public class MovieFacade {
    TV tv;
    SoundSystem soundSystem;
    Lights lights;
    DVDPlayer dvdPlayer;

    public MovieFacade(TV tv, SoundSystem soundSystem, Lights lights, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.lights = lights;
        this.dvdPlayer = dvdPlayer;
    }

    public void playMovie(String movie) {
        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        tv.on();
        tv.toHDMI();

        dvdPlayer.on();
        dvdPlayer.insertMovie(movie);

        soundSystem.on();
        soundSystem.toOpticalEntry();

        lights.off();

        System.out.println();
    }

    public void stopWatchingMovie(String movie) {
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();

        lights.on();

        tv.off();

        dvdPlayer.off();

        soundSystem.off();

        System.out.println();
    }
}
