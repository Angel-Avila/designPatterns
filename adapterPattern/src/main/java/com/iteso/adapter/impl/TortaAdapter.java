package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TortaAdapter implements Taco{
    Torta torta;

    public TortaAdapter(Torta torta){
        this.torta = torta;
    }


    public void fill() {
        torta.cutByHalf();
        torta.fill();

    }


    public void fold() {
        torta.cover();

    }


    public void printDescription() {
        torta.printDescription();
    }
}
