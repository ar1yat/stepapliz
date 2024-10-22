package ass4.Strategy;
class CashOnDeliveryStrategy implements PaymentStrategy {
    private static final double DELIVERY_FEE = 300.0;

    @Override
    public double calculateTotal(double orderAmount) {
        System.out.println("Оплата при получении: добавляем 300 рублей за доставку.");
        return orderAmount + DELIVERY_FEE; // Добавляем фиксированную плату за доставку
    }
}

