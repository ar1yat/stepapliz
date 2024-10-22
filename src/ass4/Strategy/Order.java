package ass4.Strategy;
class Order {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateFinalAmount(double orderAmount) {
        return paymentStrategy.calculateTotal(orderAmount);
    }
}
