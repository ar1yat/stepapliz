package ass4.Template;
public class Main {
    public static void main(String[] args) {
        // Создаем проверку для продуктов питания
        QualityCheck foodCheck = new FoodQualityCheck();
        System.out.println("Проверка продуктов питания:");
        foodCheck.performQualityCheck(); // Запускаем процесс проверки для продуктов питания

        System.out.println();

        // Создаем проверку для электронных товаров
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("Проверка электроники:");
        electronicsCheck.performQualityCheck(); // Запускаем процесс проверки для электроники
    }
}
