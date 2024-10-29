package MVC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    public JButton addButton = new JButton("+");
    public JButton subButton = new JButton("-");
    public JButton mulButton = new JButton("*");
    public JButton divButton = new JButton("/");
    private JLabel resultLabel = new JLabel("Результат:");

    public View() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Первое число:"));
        panel.add(firstNumber);
        panel.add(new JLabel("Второе число:"));
        panel.add(secondNumber);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(resultLabel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.add(panel);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText());
    }

    public void setResult(String result) {
        resultLabel.setText("Результат: " + result);
    }

    public void addOperationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subButton.addActionListener(listener);
        mulButton.addActionListener(listener);
        divButton.addActionListener(listener);
    }
}
