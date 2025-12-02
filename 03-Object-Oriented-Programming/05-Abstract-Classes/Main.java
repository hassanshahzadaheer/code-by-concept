package abstract_classes;

public class Main {
    public static void main(String[] args){

        PaymentProcessor paypal  = new PayPalProcessor(120.4);
        paypal.showAmount();
        paypal.processPayment();

        PaymentProcessor stripe = new StripeProcessor(89.99);
        stripe.showAmount();
        stripe.processPayment();

    }
}
