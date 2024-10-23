package assigment3.Mediator;
public class HumiditySensor implements Sensor {
    private HomeMediator mediator;
    private String humidity;

    public HumiditySensor(String humidity) {
        this.humidity = humidity;
    }

    @Override
    public void sendData() {
        System.out.println("Сенсор влажности отправляет данные: " + humidity);
        mediator.collectData(this, humidity);  // Передача данных посреднику
    }

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }
}
