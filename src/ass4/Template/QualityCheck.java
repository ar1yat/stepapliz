package ass4.Template;
abstract class QualityCheck {
    // Шаблонный метод, описывающий общий алгоритм проверки продукта
    public final void performQualityCheck() {
        checkAppearance();          // Шаг 1: Проверка внешнего вида
        checkSpecificCharacteristics(); // Шаг 2: Проверка характеристик (разная для каждого продукта)
        generateFinalReport();      // Шаг 3: Заключительный отчёт
    }

    // Шаг 1: Одинаков для всех продуктов
    private void checkAppearance() {
        System.out.println("Проверка внешнего вида продукта.");
    }

    // Шаг 2: Этот метод должен быть реализован в подклассах
    protected abstract void checkSpecificCharacteristics();

    // Шаг 3: Одинаков для всех продуктов
    private void generateFinalReport() {
        System.out.println("Финальный отчёт о проверке качества.");
    }
}
