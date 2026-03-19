package org.onlineshop.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductData {

    public static List<Product> createProductList() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "RGB Gaming Mouse (Overkill Edition)", 39.99));
        products.add(new Product(2, "Mechanical Keyboard (loud Typing Mode)", 89.99));
        products.add(new Product(3, "Wireless Headphones (Ignore Everyone Version)", 59.99));
        products.add(new Product(4, "USB-C Charger (Always Missing Edition)", 19.99));
        products.add(new Product(5, "Laptop Stand (Neck Saver Pro)", 29.99));
        products.add(new Product(6, "Smart Water Bottle (Hydration Reminder 3000)", 24.99));
        products.add(new Product(7, "Noise Cancelling Earbuds (Focus Mode)", 79.99));
        products.add(new Product(8, "Portable Power Bank (Last 1% Saver)", 34.99));
        products.add(new Product(9, "LED Desk Lamp (Late Night Coding Light)", 22.99));
        products.add(new Product(10, "Digital Notebook (I'll Start Tomorrow Edition)", 44.99));
        products.add(new Product(11, "Smart Alarm Clock (Snooze Master Pro)", 27.99));
        products.add(new Product(12, "Ergonomic Office Chair (Back Pain Destroyer)", 129.99));
        products.add(new Product(13, "USB Hub (Never Enough Ports Edition)", 21.99));
        products.add(new Product(14, "Bluetooth Speaker (Shower Concert Mode)", 35.99));
        products.add(new Product(15, "Webcam (Zoom Ready HD)", 49.99));

        return products;
    }
}

