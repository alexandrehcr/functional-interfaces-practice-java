import java.util.Comparator;

public class ProdPriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }
}
