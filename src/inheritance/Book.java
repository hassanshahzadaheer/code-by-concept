package inheritance;

public class Book extends Product{

    private String author;

    public Book(String name, double price, int stock, String author ) {
        super(name,price,stock);
        this.author = author;
    }
    public double getFinalPrice() {
        return price * 0.9;
    }


}
