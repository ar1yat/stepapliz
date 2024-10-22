package ass4.State;
class StoppedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Запуск трека с начала.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер уже остановлен, невозможно поставить на паузу.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер уже остановлен.");
    }
}
