package ass4.Strategy;
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double orderPrice) {
        return orderPrice;  // Нет комиссии
    }
}
