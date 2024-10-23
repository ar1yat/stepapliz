package assigment4.Visitor;
interface Visitor {
    void visit(TextFile textFile);        // Метод для обработки текстового файла
    void visit(ExecutableFile executableFile);  // Метод для обработки исполняемого файла
}
