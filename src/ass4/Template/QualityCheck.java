package ass4.Template;
abstract class QualityCheck {
    // Шаблонный метод, описывающий общий процесс проверки
    public final void performCheck() {
        checkAppearance();  // Шаг 1: Проверка внешнего вида
        checkSpecificCharacteristics();  // Шаг 2: Проверка специфических характеристик (зависит от продукта)
        generateReport();  // Шаг 3: Генерация отчёта
    }

    // Шаг 1: Проверка внешнего вида (одинаковая для всех)
    private void checkAppearance() {
        System.out.println("Проверка внешнего вида...");
    }

    // Шаг 2: Абстрактный метод для проверки характеристик (различается для каждого продукта)
    protected abstract void checkSpecificCharacteristics();

    // Шаг 3: Генерация отчёта (одинаковая для всех)
    private void generateReport() {
        System.out.println("Генерация заключительного отчёта...");
    }
}

