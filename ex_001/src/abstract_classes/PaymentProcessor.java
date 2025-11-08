package abstract_classes;

abstract class PaymentProcessor {
    public double amount;

    PaymentProcessor(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();

    void showAmount() {
        System.out.println("Processing amount: $" + amount);
    }

}
