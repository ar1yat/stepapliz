package assigment4.Visitor;
class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Сканируем текстовый файл на запрещённые слова: " + textFile.getContent());
        // Логика проверки на запрещённые слова
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Сканируем исполняемый файл на наличие вредоносного кода: " + executableFile.getFileName());
        // Логика проверки на вредоносный код
    }
}
