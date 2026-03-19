package org.onlineshop;

import org.onlineshop.domain.Customer;
import org.onlineshop.domain.CustomerData;
import org.onlineshop.domain.Product;
import org.onlineshop.domain.ProductData;
import org.onlineshop.domain.Order;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Customer> customers = CustomerData.createCustomers();
        List<Product> products = ProductData.createProductList();

        Order order1 = new Order(1001, customers.get(2));
        order1.addProduct(products.get(2));
        order1.addProduct(products.get(6));
        order1.addProduct(products.get(12));

        Order order2 = new Order(1002, customers.get(3));
        order2.addProduct(products.get(13));
        order2.addProduct(products.get(14));

        Order order3 = new Order(1003, customers.get(4));
        order3.addProduct(products.get(3));
        order3.addProduct(products.get(5));

        System.out.println(order1.getSummary());
        System.out.println("--------------------");
        System.out.println(order2.getSummary());
        System.out.println("--------------------");
        System.out.println(order3.getSummary());
    }
}