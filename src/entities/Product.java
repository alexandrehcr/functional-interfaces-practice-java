package entities;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticPredicate(Product product) {
        return product.getPrice() >= 600.0;
    }

    // Since it is a non-static method, it works with the instance itself.
    public boolean nonStaticPredicate() {
        return price >= 600.0;
    }

    // As static method, it doesn't know the states of any instances. Hence, the product argument.
    public static void staticPriceUpdateConsumer(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
    public void nonStaticPriceUpdateConsumer() {
        price *= 1.1;
    }

    public static String staticToUpperCaseName(Product product){
        return product.getName().toUpperCase();
    }

    public String nonStaticToUpperCaseName(){
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f", name, price);
    }
}
