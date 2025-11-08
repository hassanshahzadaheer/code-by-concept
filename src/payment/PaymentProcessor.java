package payment;

public class PaymentProcessor {

    void add(int amount) {
        System.out.println("Processing cash payment: $" + amount);
    }

    void add(long amount, int cardNumber) {
        System.out.println("Processing card payment: $" + amount + " using card " + cardNumber);
    }

    void print(int a) {
        System.out.println("print(int) called");
    }
    void print(double a) {
        System.out.println("print(double) called");
    }

    void print(int... numbers) {
        System.out.println("print(int...) called with " + numbers.length + " arguments");
    }
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

//        processor.add(4);
//        processor.add(43,44);

        processor.print(33);
        processor.print(99.5);
        processor.print(33,44,22,11,55);

    }
}
