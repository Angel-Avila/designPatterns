package com.iteso.adapter;

import java.util.ArrayList;

/**
 * Created by lamos on 10/27/2016.
 */
public class TortaPlate {
    private ArrayList tortas;

    public TortaPlate(){
        tortas = new ArrayList();
    }

    public void addTorta(Torta torta){
        tortas.add(torta);
    }

    public void servePlate(){
        for (int i = 0; i < tortas.size(); i++){
            Torta torta = (Torta) tortas.get(i);
            torta.cutByHalf();
            torta.fill();
            torta.cover();
            torta.printDescription();
        }
    }
}


