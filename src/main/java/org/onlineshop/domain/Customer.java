package org.onlineshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    public static List<org.onlineshop.model.Customer> createCustomers() {
        List<org.onlineshop.model.Customer> customers = new ArrayList<>();

            customers.add(new org.onlineshop.model.Customer(0001, "Sheldon Cooper", "drcooper@gmail.com"));
            customers.add(new org.onlineshop.model.Customer(0002, "Howard Wolowitz", "howard@wasinspace.com"));
            customers.add(new org.onlineshop.model.Customer(0003, "Leonard Hofstadter", ":leonard@gmail.com"));
            customers.add(new org.onlineshop.model.Customer(0004, "Raj Koothrappali", "raj@gmail.com"));
            customers.add(new org.onlineshop.model.Customer(0005, "Penny Hofstadter", "penny@gmail.com"));
            customers.add(new org.onlineshop.model.Customer(0006, "Bernadette Rostenkowski", "bernadette@gmail.com"));
            customers.add(new org.onlineshop.model.Customer(0007, "Amy Farrah Fowler", "Amy@gmail.com"));

            return customers;

    }

}
