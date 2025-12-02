package OOP_Interface;

public interface PaymentMethod {
    boolean processPayment(double amount);
    boolean refund(double amount);
    String getPaymentDetails();
}
