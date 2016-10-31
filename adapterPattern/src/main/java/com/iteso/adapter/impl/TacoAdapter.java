package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by lamos on 10/27/2016.
 */
public abstract class TacoAdapter implements Torta {
    Taco taco;

    public TacoAdapter(Taco taco){
        this.taco = taco;
    }


    public void CutByHalf() {

    }


    public void Fill() {
        taco.fill();

    }
public void Cover(){
    taco.fold();
}

    public void printDescription() {
        taco.printDescription();
    }
}
