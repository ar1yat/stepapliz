package assigment4.State;
class PlayingState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Плеер уже воспроизводит музыку.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер поставлен на паузу.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер остановлен.");
        player.setState(new StoppedState());
    }
}

