package ass4.State;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();  // Создаем экземпляр плеера
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Добро пожаловать в мультимедийный плеер!");
        System.out.println("Введите одну из команд: play, pause, stop, exit для выхода.");

        // Бесконечный цикл для принятия команд от пользователя
        while (true) {
            System.out.print("Введите команду: ");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "play":
                    player.play();
                    break;
                case "pause":
                    player.pause();
                    break;
                case "stop":
                    player.stop();
                    break;
                case "exit":
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неизвестная команда. Попробуйте снова.");
            }
        }
    }
}

