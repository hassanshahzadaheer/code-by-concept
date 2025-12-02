package abstract_classes;

public class PayPalProcessor extends PaymentProcessor{

    PayPalProcessor(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Payment of $" + amount + " processed via PayPal");
    }
}
