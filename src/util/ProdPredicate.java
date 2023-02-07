package util;

import entities.Product;

import java.util.function.Predicate;

public class ProdPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 600.0;
    }
}
