import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Smart TV", 590.00));
        products.add(new Product("Notebook", 1900.00));
        products.add(new Product("Keyboard", 140.00));
        products.add(new Product("Mouse", 80.00));
        products.add(new Product("Air Conditioning", 770.00));
        products.add(new Product("Electric Guitar", 650.00));


        System.out.println("====== BEFORE SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }

        // Even though Product still implements Comparable, passing a Comparator to sort makes it use that.
        Collections.sort(products, new ProdNameComparator());

        System.out.println();
        System.out.println("====== AFTER NAME SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }

        // Now, instead of using the Collections' version of sort, the List's one is being used.
        products.sort(new ProdPriceComparator());

        System.out.println();
        System.out.println("====== AFTER ASC. PRICE SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
