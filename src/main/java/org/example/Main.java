package org.example;

import org.example.cart.Cart;
import org.example.repository.ProductRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        Cart cart = new Cart(productRepository);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an action: (1) Add product (2) Remove product (3) View cart (4) Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter product ID to add:");
                    int addId = scanner.nextInt();
                    cart.addProduct(addId);
                    break;
                case 2:
                    System.out.println("Enter product ID to remove:");
                    int removeId = scanner.nextInt();
                    cart.removeProduct(removeId);
                    break;
                case 3:
                    cart.showCart(productRepository);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}