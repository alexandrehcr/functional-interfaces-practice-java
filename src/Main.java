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

        // Creates a Comparator in the form of an anonymous class
        Comparator<Product> descNameComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return - o1.getName().compareToIgnoreCase(o2.getName());
            }
        };
        products.sort(descNameComparator);

        System.out.println();
        System.out.println("====== AFTER DESC. NAME SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }

        Comparator<Product> descPriceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return - o1.getPrice().compareTo(o2.getPrice());
            }
        };

        products.sort(descPriceComparator);

        System.out.println();
        System.out.println("====== AFTER DESC. PRICE SORT ======");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
