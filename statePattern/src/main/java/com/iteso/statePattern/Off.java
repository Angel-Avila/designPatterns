package com.iteso.statePattern;

/**
 * Created by Angel on 11/16/16.
 */
class Off implements State
{
    public String pull(CeilingFanPullChain wrapper)
    {
        wrapper.set_state(new Low());
        System.out.println("   low speed");
        return "Low";
    }
}