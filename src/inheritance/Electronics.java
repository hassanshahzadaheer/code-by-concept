package inheritance;

public class Electronics extends Product{
    private int warranty;
    private int stock;

    public Electronics(String name, double price, int warranty,int stock) {
        super(name,price,stock);
        this.warranty = warranty;
        this.stock = stock;

    }

    public double getFinalPrice() {
        return price * 0.85;
    }
}
