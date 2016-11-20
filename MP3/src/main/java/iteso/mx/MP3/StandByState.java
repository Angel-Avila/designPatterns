package iteso.mx.MP3;


/**
 * Created by lamos on 11/17/2016.
 */
public class StandByState implements State {
    public void pressButton(Mp3Context context) {
        context.setState(new PauseState());
    }
}
