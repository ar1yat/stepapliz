package ass4.Visitor;
public class Main {
    public static void main(String[] args) {
        // Создаем несколько файлов
        File textFile1 = new TextFile("Документ с текстом");
        File executableFile1 = new ExecutableFile("program.exe");

        // Создаем посетителей
        Visitor antivirusVisitor = new AntivirusVisitor();
        Visitor reportVisitor = new ReportVisitor();

        // Сканируем файлы с помощью антивируса
        System.out.println("Антивирусное сканирование:");
        textFile1.accept(antivirusVisitor);
        executableFile1.accept(antivirusVisitor);

        System.out.println();

        // Генерируем отчеты по файлам
        System.out.println("Генерация отчётов:");
        textFile1.accept(reportVisitor);
        executableFile1.accept(reportVisitor);
    }
}
