package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.SoundSystem;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bose implements SoundSystem {

    private void failure() {
        System.out.println("Something went wrong!");
    }

    @Override
    public boolean on() {
        boolean success = true;

        // Process of turning sound system on (can fail)
        // Change bool value depending on if it was successful

        if(success) {
            System.out.println("Bose Surround System is turning ON");
            System.out.println("Bose Surround System is ON");
        } else {
            failure();
        }

        return success;
    }

    @Override
    public boolean off() {
        boolean success = true;

        // Process of turning sound system off (can fail)
        // Change bool value depending on if it was successful

        if(success) {
            System.out.println("Bose Surround System is turning OFF");
            System.out.println("Bose Surround System is OFF");
        } else {
            failure();
        }

        return success;
    }

    @Override
    public boolean toOpticalEntry() {
        boolean success = true;

        // Process (can fail)
        // Change bool value depending on if it was successful

        if(success)
            System.out.println("Changing Bose input to Optical");
        else
            failure();

        return success;
    }
}
