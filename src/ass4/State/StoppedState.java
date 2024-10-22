package ass4.State;
class StoppedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Плеер начал воспроизведение с начала.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Нельзя поставить на паузу. Плеер остановлен.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер уже остановлен.");
    }
}

