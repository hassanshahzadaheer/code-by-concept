package OOP_Interface;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;
    private String holderName;
    private double balance;

    public CreditCardPayment(String cardNumber, String holderName, double balance) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    @Override
    public boolean processPayment(double amount) {

        if(amount <= 0) return false;

        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }

        return false;
    }

    @Override
    public boolean refund(double amount) {
        if(amount <= 0) return false;

        if (this.balance >= amount) {
            this.balance += amount;
            return true;
        }

        return false;
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card - " + this.cardNumber + " - " + this.holderName;
    }
}
