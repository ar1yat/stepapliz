package ass4.Observer;
class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Планшет получил новость из категории " + category + ": " + news);
    }
}
