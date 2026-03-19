package org.onlineshop.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerData {

    public static List<Customer> createCustomers() {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "Sheldon Cooper", "drcooper@gmail.com"));
        customers.add(new Customer(2, "Howard Wolowitz", "howard@wasinspace.com"));
        customers.add(new Customer(3, "Leonard Hofstadter", "leonard@gmail.com"));
        customers.add(new Customer(4, "Raj Koothrappali", "raj@gmail.com"));
        customers.add(new Customer(5, "Penny Hofstadter", "penny@gmail.com"));
        customers.add(new Customer(6, "Bernadette Rostenkowski", "bernadette@gmail.com"));
        customers.add(new Customer(7, "Amy Farrah Fowler", "amy@gmail.com"));

        return customers;
    }
}