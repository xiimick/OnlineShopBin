package org.example.cart;
import org.example.model.Product;
import org.example.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();
    private ProductRepository productRepository;

    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(int productId) {
        Product product = productRepository.getProductById(productId);
        if (product != null) {
            items.add(product);
            System.out.println("Product added to the cart.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void removeProduct(int productId) {
        items.removeIf(p -> p.getId() == productId);
        System.out.println("Product removed from the cart.");
    }

    public void showCart(ProductRepository productRepository) {
        if (items.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            for (Product product : items) {
                System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
            }
        }
    }
}