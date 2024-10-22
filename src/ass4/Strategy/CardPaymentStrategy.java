package ass4.Strategy;
class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double orderAmount) {
        System.out.println("Оплата картой: добавляем 2% комиссии.");
        return orderAmount * 1.02; // Добавляем 2% комиссии
    }
}
