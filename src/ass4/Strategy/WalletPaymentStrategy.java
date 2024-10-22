package ass4.Strategy;
class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double orderAmount) {
        System.out.println("Оплата электронным кошельком: без комиссии.");
        return orderAmount; // Без комиссии
    }
}
