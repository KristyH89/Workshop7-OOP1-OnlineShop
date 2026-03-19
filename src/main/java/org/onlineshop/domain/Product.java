package org.onlineshop.domain;

public class Product {

    private final int productId;
    private String productName;
    private double price;

    // Constructor;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        setProductName(productName);
        setPrice(price);

    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

public void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        this.productName = productName;
}
public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
}

}
