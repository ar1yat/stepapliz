package assigment3.Mediator;
public class Main {
    public static void main(String[] args) {
        // Создаём посредника
        HomeMediator mediator = new HomeMediatorImpl();

        // Создаём сенсоры
        Sensor temperatureSensor = new TemperatureSensor("22°C");
        Sensor humiditySensor = new HumiditySensor("45%");
        Sensor lightSensor = new LightSensor("300 люкс");

        // Назначаем посредника каждому сенсору
        temperatureSensor.setMediator(mediator);
        humiditySensor.setMediator(mediator);
        lightSensor.setMediator(mediator);

        // Сенсоры отправляют данные через посредника
        temperatureSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        // Вывод отчёта с данными
        ((HomeMediatorImpl) mediator).printReport();
    }
}
