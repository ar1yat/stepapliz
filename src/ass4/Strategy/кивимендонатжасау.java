package ass4.Strategy;
class кивимендонатжасау implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double orderPrice) {
        return orderPrice;  // Нет комиссии
    }
}
