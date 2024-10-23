package assigment3.Mediator;
public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;
    private String temperature;

    public TemperatureSensor(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public void sendData() {
        System.out.println("Температурный сенсор отправляет данные: " + temperature);
        mediator.collectData(this, temperature);  // Передача данных посреднику
    }

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }
}
