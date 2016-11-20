package iteso.mx.MP3;

/**
 * Created by lamos on 11/17/2016.
 */
public class Mp3Context {

        private static Mp3Context mp3Instance = new Mp3Context(new StandByState());

        private State state;
        private Mp3Context(State state) {
            this.state= state;
        }

        public String play() {
            if(state.getClass().equals(PlayingState.class)) {
                return "Already playing";
            } else if(state.getClass().equals(PauseState.class)) {
                state.pressButton(this);
                return "Un-pausing song";
            } else {
                return "Can't play from stand by";
            }
        }

        public String pause() {
            if(state.getClass().equals(PauseState.class)) {
                return "Already paused";
            }
            else if(state.getClass().equals(StandByState.class)) {
                state.pressButton(this);
                return "Pausing";
            } else {
                return "Can't pause while playing (don't ask)";
            }
        }
        public String standBy() {
            if(state.getClass().equals(StandByState.class)) {
                return "Already on stand by";
            }
            else if(state.getClass().equals(PlayingState.class)) {
                state.pressButton(this);
                return "Standing by";
            } else {
                return "Can't stand by while on pause";
            }
        }

        public static Mp3Context getMp3Instance() {
            return mp3Instance;
        }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
