package iteso.mx.MP3.Impl;

import iteso.mx.MP3.Mp3Context;

/**
 * Created by lamos on 11/19/2016.
 */
public class PauseState implements State{
    public void pressPlay(Mp3Context context) {
        context.setState(new PauseState());
    }
}
