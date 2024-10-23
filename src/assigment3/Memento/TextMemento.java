package assigment3.Memento;
public class TextMemento {
    private final String state;  // Сохранённое состояние текста

    public TextMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
