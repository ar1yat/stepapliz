package ass4.Strategy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаём заказ
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стоимость заказа:");
        double orderPrice = scanner.nextDouble();

        // Выбор стратегии оплаты
        System.out.println("Выберите способ оплаты:");
        System.out.println("1. Сіздерге банк карточкасымен төлеуге болады ма?(Қайрош Нұртас) (2% комиссия)");
        System.out.println("2. Кивимен донат жасау (без комиссии)");
        System.out.println("3. Сначала товар потом деньги (+3000 теңге мопедистке)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                order.setPaymentStrategy(new банккарточкасыментолеу());
                break;
            case 2:
                order.setPaymentStrategy(new кивимендонатжасау());
                break;
            case 3:
                order.setPaymentStrategy(new колмаколтолеу());
                break;
            default:
                System.out.println("Неверный выбор способа оплаты.");
                return;
        }

        // Рассчитываем итоговую стоимость
        double finalPrice = order.calculateFinalPrice(orderPrice);
        System.out.println("Итоговая стоимость заказа: " + finalPrice + " теңге");
    }
}

