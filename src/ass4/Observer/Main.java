package ass4.Observer;
public class Main {
    public static void main(String[] args) {
        // Создаем издателя новостей
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создаем подписчиков
        Observer smartphone = new NewsSubscriberSmartphone();
        Observer laptop = new NewsSubscriberLaptop();
        Observer tablet = new NewsSubscriberTablet();

        // Добавляем подписчиков
        newsPublisher.subscribe(smartphone);
        newsPublisher.subscribe(laptop);
        newsPublisher.subscribe(tablet);

        // Публикуем новости и проверяем уведомления
        newsPublisher.publishNews("Sports", "Финал чемпионата мира по футболу!");
        newsPublisher.publishNews("Science", "Открытие новой элементарной частицы!");
        newsPublisher.publishNews("Politics", "Выборы президента завершены.");
    }
}
