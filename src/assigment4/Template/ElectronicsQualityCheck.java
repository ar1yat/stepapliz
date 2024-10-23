package assigment4.Template;
class ElectronicsQualityCheck extends QualityCheck {
    private boolean functionality;
    private boolean warranty;

    public ElectronicsQualityCheck(boolean functionality, boolean warranty) {
        this.functionality = functionality;
        this.warranty = warranty;
    }

    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Проверка работоспособности: " + (functionality ? "Работает" : "Не работает"));
        System.out.println("Проверка наличия гарантии: " + (warranty ? "Есть гарантия" : "Гарантии нет"));
    }
}

