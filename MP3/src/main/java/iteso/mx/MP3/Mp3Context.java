package iteso.mx.MP3;

import iteso.mx.MP3.Impl.State;

/**
 * Created by lamos on 11/17/2016.
 */
public class Mp3Context {

        private State state;
        private Mp3Context(State state) {
            this.state= state;
        }
        public void play() {
            state.pressPlay(this);
        }
        public void setState(State state) {
            this.state = state;
        }
        public State getState() {
            return state;
        }
}
