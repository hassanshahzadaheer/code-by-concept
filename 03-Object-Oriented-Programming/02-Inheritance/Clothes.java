package inheritance;

public class Clothes extends Product{

    protected int size;
    protected String brand;

    public Clothes(String name, int price, int stock, int size, String brand) {
        super(name,price,stock);

        this.size = size;
        this.brand = brand;

    }

    @Override
    public double getFinalPrice() {
        return price * 0.80;
    }
}
