package ass4.Observer;
import java.util.ArrayList;
import java.util.List;

class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String category, String news) {
        for (Observer observer : subscribers) {
            observer.update(category, news);
        }
    }

    // Метод для публикации новости
    public void publishNews(String category, String news) {
        System.out.println("Опубликована новость в категории \"" + category + "\": " + news);
        notifyObservers(category, news);
    }
}

