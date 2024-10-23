package ass4.Observer;
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Уведомление на планшет: Новость из категории " + category + " - " + news);
    }
}
