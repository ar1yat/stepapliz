package assigment4.State;
public class Player {
    private PlayerState currentState;

    public Player() {
        // Изначально плеер находится в состоянии остановки
        currentState = new StoppedState();
    }

    public void setState(PlayerState state) {
        this.currentState = state;
    }

    public void play() {
        currentState.play(this);
    }

    public void pause() {
        currentState.pause(this);
    }

    public void stop() {
        currentState.stop(this);
    }
}
