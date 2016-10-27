package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TacoLengua implements Taco {

    public void fill() {
        System.out.println("Take a tortilla and fill it with Lengua");
    }


    public void fold() {
        System.out.println("Fold the tortilla");

    }


    public void printDescription() {
        System.out.println("Lengua Taco");
    }
}
