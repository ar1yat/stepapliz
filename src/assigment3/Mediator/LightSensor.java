package assigment3.Mediator;
public class LightSensor implements Sensor {
    private HomeMediator mediator;
    private String lightLevel;

    public LightSensor(String lightLevel) {
        this.lightLevel = lightLevel;
    }

    @Override
    public void sendData() {
        System.out.println("Сенсор освещённости отправляет данные: " + lightLevel);
        mediator.collectData(this, lightLevel);  // Передача данных посреднику
    }

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }
}
