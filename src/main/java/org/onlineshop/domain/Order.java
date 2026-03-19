package org.onlineshop.domain;

import java.util.List;
import java.util.ArrayList;

public class Order {

    private final Customer customer;
    private final List<Product> products;
    private double totalPrice;

    public Order(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }

        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct(Product p) {
        if (p == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }

        products.add(p);
        totalPrice += p.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public String getSummary() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order for ")
                .append(customer.getName())
                .append(":\n");

        for (Product p : products) {
            sb.append("- ")
                    .append(p.getProductName())
                    .append(", €")
                    .append(String.format("%.2f", p.getPrice()))
                    .append(System.lineSeparator());
        }

        sb.append("Total: €")
                .append(String.format("%.2f", totalPrice));

        return sb.toString();
    }
}