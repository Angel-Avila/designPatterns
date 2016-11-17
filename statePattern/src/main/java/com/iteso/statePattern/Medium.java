package com.iteso.statePattern;

/**
 * Created by Angel on 11/16/16.
 */
class Medium implements State
{
    public String pull(CeilingFanPullChain wrapper)
    {
        wrapper.set_state(new High());
        System.out.println("   high speed");
        return "High";
    }
}