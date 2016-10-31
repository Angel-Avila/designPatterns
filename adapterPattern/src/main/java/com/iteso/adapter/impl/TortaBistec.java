package com.iteso.adapter.impl;

import com.iteso.adapter.Torta;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TortaBistec implements Torta {

    public void cutByHalf() {
        System.out.println("Take a bread and cut it by half");
    }


    public void fill() {
        System.out.println("Take the bottom half and fill it with Bistec");
    }


    public void cover() {
        System.out.println("Put the top of the bread");
    }


    public void printDescription() {
        System.out.println("Bistec Torta");
    }
}
