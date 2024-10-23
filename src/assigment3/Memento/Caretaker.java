package assigment3.Memento;
import java.util.Stack;

public class Caretaker {
    private Stack<TextMemento> history = new Stack<>();  // История снимков

    // Сохранение состояния редактора
    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    // Восстановление последнего сохранённого состояния
    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        } else {
            System.out.println("Нет доступных снимков для восстановления.");
        }
    }
}
