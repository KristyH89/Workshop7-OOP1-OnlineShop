package org.onlineshop.domain;

public class Customer {

    private final int customerId;
    private String name;
    private String email;

    // Constructor
    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        setName(name);
        setEmail(email);

    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "org.catalog.Customer ID: " + customerId + ", Name: " + name + ", Email: " + email;

    }

}
