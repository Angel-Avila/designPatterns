package iteso.mx.MP3.Impl;


import iteso.mx.MP3.Mp3Context;


/**
 * Created by lamos on 11/17/2016.
 */
public class StandByState implements State {
    public void pressPlay(Mp3Context context) {
        context.setState(new StandByState());
    }
}
