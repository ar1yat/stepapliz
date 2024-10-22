package ass4.State;
class PausedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Плеер возобновил воспроизведение.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер уже на паузе.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер остановлен.");
        player.setState(new StoppedState());
    }
}

