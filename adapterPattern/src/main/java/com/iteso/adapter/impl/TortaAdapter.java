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

    @Override
    public void fill() {
        torta.cutByHalf();
        torta.fill();

    }

    @Override
    public void fold() {
        torta.cover();

    }

    @Override
    public void printDescription() {
        torta.printDescription();
    }
}
