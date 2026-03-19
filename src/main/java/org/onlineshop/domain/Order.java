package org.onlineshop.domain;

import java.util.List;
import java.util.ArrayList;

public class Order {

    private final Customer customer;
    private final List<Product> products;
    private double totalPrice;

    // Constructor
    public Order(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }

        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }
    // Add product and automatic update price
    public void addProduct(Product p) {
        products.add(p);
        totalPrice += p.getPrice();
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    // Get the list of products
    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    // Give view of summary
    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order for ").append(customer.getName()).append(":\n");
        for (Product p : products) {
            sb.append("- ").append(String.format("%.2f", totalPrice));
            return sb.toString();
        }
    }
}
