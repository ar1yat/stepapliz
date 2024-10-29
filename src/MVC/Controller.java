package MVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.addOperationListener(new OperationListener());
    }

    class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = view.getFirstNumber();
                double secondNumber = view.getSecondNumber();
                String result = "";

                if (e.getSource() == view.addButton) {
                    result = String.valueOf(model.add(firstNumber, secondNumber));
                } else if (e.getSource() == view.subButton) {
                    result = String.valueOf(model.subtract(firstNumber, secondNumber));
                } else if (e.getSource() == view.mulButton) {
                    result = String.valueOf(model.multiply(firstNumber, secondNumber));
                } else if (e.getSource() == view.divButton) {
                    result = String.valueOf(model.divide(firstNumber, secondNumber));
                }

                view.setResult(result);
            } catch (ArithmeticException ex) {
                view.setResult(ex.getMessage());
            } catch (NumberFormatException ex) {
                view.setResult("Ошибка: неверный ввод");
            }
        }
    }
}
