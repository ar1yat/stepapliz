package ass4.Strategy;
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double orderPrice) {
        return orderPrice * 1.02;  // Добавление 2% комиссии
    }
}




