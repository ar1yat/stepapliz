package ass4.Strategy;
public class Main {
    public static void main(String[] args) {
        // Создаем заказ
        Order order = new Order();
        double orderAmount = 1000.0; // Исходная сумма заказа

        // Оплата картой
        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Итоговая стоимость при оплате картой: " + order.calculateFinalAmount(orderAmount));

        // Оплата электронным кошельком
        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Итоговая стоимость при оплате электронным кошельком: " + order.calculateFinalAmount(orderAmount));

        // Наложенный платеж
        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Итоговая стоимость при наложенном платеже: " + order.calculateFinalAmount(orderAmount));
    }
}
