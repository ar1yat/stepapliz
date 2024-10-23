package assigment3.Mediator;
import java.util.HashMap;
import java.util.Map;

public class HomeMediatorImpl implements HomeMediator {
    private Map<String, String> sensorData = new HashMap<>();  // Хранение данных от сенсоров

    @Override
    public void collectData(Sensor sensor, String data) {
        sensorData.put(sensor.getClass().getSimpleName(), data);  // Собираем данные от сенсора
    }

    // Метод для вывода отчёта с собранными данными
    public void printReport() {
        System.out.println("Отчёт с данными сенсоров:");
        sensorData.forEach((sensor, data) -> System.out.println(sensor + ": " + data));
    }
}
