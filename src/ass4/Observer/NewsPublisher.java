package ass4.Observer;
interface NewsPublisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String category, String news);
}

