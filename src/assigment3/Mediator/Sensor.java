package assigment3.Mediator;
public interface Sensor {
    void sendData();  // Отправка данных через посредника
    void setMediator(HomeMediator mediator);  // Установка посредника
}
