package iteso.mx.MP3;

/**
 * Created by lamos on 11/19/2016.
 */
public class PauseState implements State{
    public void pressButton(Mp3Context context) {
        context.setState(new PlayingState());
    }
}
