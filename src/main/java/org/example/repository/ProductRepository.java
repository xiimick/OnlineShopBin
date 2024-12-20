package org.example.repository;

import org.example.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1, "Laptop", 999.99));
        products.add(new Product(2, "Phone", 499.99));
        products.add(new Product(3, "Headphones", 59.99));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    // Add CRUD methods here
}