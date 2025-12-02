package inheritance;

public class Product {


    protected String name;
    protected double price;
    protected int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }


    public double getFinalPrice() {
        return this.price;
    }
}
