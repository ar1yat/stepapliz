package assigment4.Observer;
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Наука")) {
            System.out.println("Уведомление на ноутбук: Новость из категории Наука - " + news);
        }
    }
}
