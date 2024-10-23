package assigment4.Observer;
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Спорт")) {
            System.out.println("Уведомление на смартфон: Новость из категории Спорт - " + news);
        }
    }
}

