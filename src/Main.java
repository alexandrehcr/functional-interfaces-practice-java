import java.util.*;

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

        // Creates a Comparator in the form of lambda expression, which is an anonymous or arrow function.
        Comparator<Product> descNameComparator = (p1, p2) -> - p1.getName().compareToIgnoreCase(p2.getName());

        products.sort(descNameComparator);

        System.out.println();
        System.out.println("====== AFTER DESC. NAME SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }

        Comparator<Product> ascPriceComparator = (p1, p2) -> p1.getPrice().compareTo(p2.getPrice());

        products.sort(ascPriceComparator);

        System.out.println();
        System.out.println("====== AFTER ASC. PRICE SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
