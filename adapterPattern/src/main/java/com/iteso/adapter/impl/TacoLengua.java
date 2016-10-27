package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TacoLengua implements Taco {
    @Override
    public void fill() {
        System.out.println("Take a tortilla and fill it with Lengua");
    }

    @Override
    public void fold() {
        System.out.println("Fold the tortilla");

    }

    @Override
    public void printDescription() {
        System.out.println("Lengua Taco");
    }
}
