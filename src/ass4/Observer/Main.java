package ass4.Observer;
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
    }
}
