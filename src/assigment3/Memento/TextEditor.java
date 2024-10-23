package assigment3.Memento;
public class TextEditor {
    private StringBuilder text;  // Текущее состояние текста

    public TextEditor() {
        this.text = new StringBuilder();
    }

    // Добавление текста в редактор
    public void addText(String newText) {
        text.append(newText).append("\n");
    }

    // Показ текущего текста
    public void showText() {
        System.out.println("Текущий текст:");
        System.out.println(text.toString());
    }

    // Создание снимка (сохранение состояния)
    public TextMemento save() {
        return new TextMemento(text.toString());
    }

    // Восстановление текста из снимка
    public void restore(TextMemento memento) {
        this.text = new StringBuilder(memento.getState());
    }
}
