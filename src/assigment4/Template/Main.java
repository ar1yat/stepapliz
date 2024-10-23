package assigment4.Template;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип продукта для проверки:");
        System.out.println("1. Продукты питания");
        System.out.println("2. Электроника");

        int choice = scanner.nextInt();
        QualityCheck qualityCheck;

        switch (choice) {
            case 1:
                // Пользователь вводит характеристики продукта питания
                System.out.println("Введите срок годности продукта:");
                String expirationDate = scanner.next();

                System.out.println("Введите состав продукта:");
                String composition = scanner.next();

                // Создаём экземпляр FoodQualityCheck с введёнными данными
                qualityCheck = new FoodQualityCheck(expirationDate, composition);
                break;

            case 2:
                // Пользователь вводит характеристики электроники
                System.out.println("Работоспособность продукта (true/false):");
                boolean functionality = scanner.nextBoolean();

                System.out.println("Наличие гарантии (true/false):");
                boolean warranty = scanner.nextBoolean();

                // Создаём экземпляр ElectronicsQualityCheck с введёнными данными
                qualityCheck = new ElectronicsQualityCheck(functionality, warranty);
                break;

            default:
                System.out.println("Неверный выбор.");
                return;
        }

        // Запуск проверки выбранного продукта
        qualityCheck.performCheck();
    }
}
