package assigment3.Memento;
public class Main {
    public static void main(String[] args) {
        // Создаём редактор и caretaker
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Добавляем текст в редактор
        editor.addText("Первая строка текста.");
        editor.showText();

        // Сохраняем состояние редактора
        caretaker.save(editor);

        // Добавляем ещё текст
        editor.addText("Вторая строка текста.");
        editor.showText();

        // Восстанавливаем состояние редактора
        caretaker.undo(editor);
        editor.showText();  // Должно вернуться к первому сохранённому состоянию
    }
}
