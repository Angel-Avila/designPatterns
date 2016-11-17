package com.iteso.statePattern;

/**
 * Created by Angel on 11/16/16.
 */
class High implements State
{
    public String pull(CeilingFanPullChain wrapper)
    {
        wrapper.set_state(new Off());
        System.out.println("   turning off");
        return "Off";
    }
}