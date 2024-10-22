package ass4.Template;
class FoodQualityCheck extends QualityCheck {
    private String expirationDate;
    private String composition;

    public FoodQualityCheck(String expirationDate, String composition) {
        this.expirationDate = expirationDate;
        this.composition = composition;
    }

    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Проверка срока годности: " + expirationDate);
        System.out.println("Проверка состава: " + composition);
    }
}
