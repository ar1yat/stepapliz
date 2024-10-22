package ass4.Strategy;
class Order {
    private PaymentStrategy paymentStrategy;

    // Устанавливаем стратегию оплаты
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Рассчитываем итоговую стоимость заказа с учётом стратегии оплаты
    public double calculateFinalPrice(double orderPrice) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Стратегия оплаты не установлена");
        }
        return paymentStrategy.calculateFinalPrice(orderPrice);
    }
}

