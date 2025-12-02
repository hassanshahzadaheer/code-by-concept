package abstract_classes;

public class StripeProcessor extends PaymentProcessor{


    StripeProcessor(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Payment of $" + amount + " processed via Stripe ");
    }
}
