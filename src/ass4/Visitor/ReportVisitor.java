package ass4.Visitor;
class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Генерируем отчёт для текстового файла. Содержимое: " + textFile.getContent());
        // Логика для создания отчёта
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Генерируем отчёт для исполняемого файла: " + executableFile.getFileName());
        // Логика для создания отчёта
    }
}
