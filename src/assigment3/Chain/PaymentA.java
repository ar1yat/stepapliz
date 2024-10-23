package assigment3.Chain;
public class PaymentA extends PaymentHandler {
    private double balance = 100;

    @Override
    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println("Payment of $" + amount + " processed by PaymentA.");
        } else if (nextHandler != null) {
            System.out.println("PaymentA cannot cover $" + amount + ", forwarding to PaymentB.");
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("None of the payment methods can cover $" + amount + ".");
        }
    }
}

