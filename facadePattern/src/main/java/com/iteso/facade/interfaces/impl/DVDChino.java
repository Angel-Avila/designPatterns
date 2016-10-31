package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.DVDPlayer;

/**
 * Created by Angel on 10/27/16.
 */
public class DVDChino implements DVDPlayer {
    @Override
    public void on() {
        System.out.println("Chinese DVD 3 is ON");
    }

    @Override
    public void off() {
        System.out.println("Chinese DVD 3 is OFF");
    }

    @Override
    public void insertMovie(String movie) {
        System.out.println(movie + " has been inserted into your chinese DVD and is now playing!");
    }
}
