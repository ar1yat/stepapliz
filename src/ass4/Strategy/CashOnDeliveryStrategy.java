package ass4.Strategy;
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double orderPrice) {
        return orderPrice + 3000;  // мопедистке 3000 тенге береміз
    }
}

