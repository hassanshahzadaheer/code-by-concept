package inheritance;

public class Shop {

    public static void main(String[] args) {

        Product book =  new Book("Java How to Program",99.4,12,"MIT");
        Product cloth = new Clothes("J.",887,90,12,"JJ");
        Product computer = new Electronics("Mac Book Pro",3344,10,2);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(book);
        cart.addProduct(cloth);
        cart.addProduct(computer);


        System.out.println(cart.getTotalPrice());
        cart.displayCart();
    }
}
