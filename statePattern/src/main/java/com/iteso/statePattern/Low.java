package com.iteso.statePattern;

/**
 * Created by Angel on 11/16/16.
 */
class Low implements State
{
    public String pull(CeilingFanPullChain wrapper)
    {
        wrapper.set_state(new Medium());
        System.out.println("   medium speed");
        return "Medium";
    }
}