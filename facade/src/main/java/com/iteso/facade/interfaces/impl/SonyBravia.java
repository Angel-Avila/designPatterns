package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.TV;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class SonyBravia implements TV {
    @Override
    public void on() {
        System.out.println("Sony Bravia is ON");
    }

    @Override
    public void off() {
        System.out.println("Sony Bravia is OFF");
    }

    @Override
    public void toHDMI() {
        System.out.println("Changing Sony Bravia input to HDMI");
    }
}
