    package inheritance;

    import java.util.ArrayList;

    public class ShoppingCart {
        ArrayList<Product> cart = new ArrayList<Product>();

        public void addProduct(Product p) {
            cart.add(p);
        }

        public double getTotalPrice() {
            double sum = 0;
            for (Product product : cart) {
                sum = sum + product.getFinalPrice();
            }
            return  sum;
        }

        public void displayCart() {
            for (Product product : cart) {
                System.out.println(product.name + " - Original: $" + product.price + " - Final: $" + product.getFinalPrice());
            }
            System.out.println("Total: $" + getTotalPrice());
        }
    }
