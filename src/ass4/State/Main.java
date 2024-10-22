package ass4.State;
public class Main {
    public static void main(String[] args) {
        // Создаем плеер
        Player player = new Player();

        // Пытаемся воспроизвести трек
        player.play();   // Запуск трека с начала
        player.pause();  // Плеер ставится на паузу
        player.play();   // Возобновляем воспроизведение
        player.stop();   // Плеер остановлен
        player.pause();  // Плеер уже остановлен, невозможно поставить на паузу
    }
}
