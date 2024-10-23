

import ass4.Observer.*;
import ass4.State.Player;
import ass4.Strategy.Order;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Создаём издателя новостей
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создаём подписчиков
        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        // Подписываем подписчиков на новости
        newsPublisher.subscribe(smartphoneSubscriber);
        newsPublisher.subscribe(laptopSubscriber);
        newsPublisher.subscribe(tabletSubscriber);

        // Вводим новости вручную
        Scanner scanner = new Scanner(System.in);
        String category, news;

        while (true) {
            System.out.println("\nВведите категорию новости (Спорт, Наука, Технологии) или 'exit' для выхода:");
            category = scanner.nextLine().trim();

            if (category.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Введите текст новости:");
            news = scanner.nextLine().trim();

            // Публикуем новость
            newsPublisher.publishNews(category, news);
        }

        System.out.println("Программа завершена.");


        Player player = new Player();  // Создаем экземпляр плеера
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


