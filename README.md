![Java](https://img.shields.io/badge/Java-25.0.2-blue)
## 🛍️ Workshop 7: OOP1 Online Shop


For this workshop, I built a simple online shop simulation using Object-Oriented Programming (OOP) principles.  
The focus was on designing classes, applying encapsulation, and connecting objects correctly.

---

## 📘 Workshop document
[Instructions Workshop7](OOP1_Workshop.md) 

---

## 🧩 Design Choices

This project follows Object-Oriented Programming principles:

- `Customer` represents a single customer  
- `Product` represents a product with a name and price  
- `Order` represents a purchase made by a customer  

The `Order` class is responsible for:
- Adding products to an order  
- Calculating the total price  
- Providing a summary of the order  

To keep responsibilities clear:
- Data classes (`CustomerData`, `ProductData`) provide sample data  
- Domain classes contain the core logic  

Additionally, no setters are used in the `Order` class.  
Instead, products are added via the `addProduct()` method, ensuring that the total price is always calculated correctly.

---
## 📁 Project Structure

```
org.onlineshop
├── domain
│ ├── Customer.java
│ ├── CustomerData.java
│ ├── Order.java
│ ├── Product.java
│ └── ProductData.java
└── Main.java
```
---

## ⚙️ Features

- Create customers and products  
- Create orders for a customer  
- Add multiple products to an order  
- Automatically calculate total price  
- Display a clear order summary  

---

## ▶️ How to Run

### Option 1: Run in IntelliJ or another Java IDE
1. Clone or download the project from GitHub:
   - Git clone:
     ```bash
     git clone https://github.com/KristyH89/Workshop7-OOP1-OnlineShop.git
     ```
   - Or download the ZIP from GitHub and extract it.
2. Open the project folder in IntelliJ IDEA (or another Java IDE).
3. Wait for the IDE to index and set up the project.
4. Run the `Main` class.
5. The output will be printed in the console.

### Option 2: Run via Command Line (if Java is installed)
1. Open a terminal in the project folder.
2. Compile all Java files:
   ```bash
   javac -d out src/org/onlineshop/domain/*.java src/org/onlineshop/Main.java
3. Run the Main class
 ```bash
 java -cp out org.onlineshop.Main
```
4. The console will show the expected order output.

---


## 🎯 Expected Output:

```
Order ID: 1001 for Leonard Hofstadter:
- Wireless Headphones (Ignore Everyone Version), € 59.99
- Noise Cancelling Earbuds (Focus Mode), € 79.99
- USB Hub (Never Enough Ports Edition), € 21.99
Total: € 161.97
--------------------
Order ID: 1002 for Raj Koothrappali:
- Bluetooth Speaker (Shower Concert Mode), € 35.99
- Webcam (Zoom Ready HD), € 49.99
Total: € 85.98
--------------------
Order ID: 1003 for Penny Hofstadter:
- USB-C Charger (Always Missing Edition), € 19.99
- Smart Water Bottle (Hydration Reminder 3000), € 24.99
Total: € 44.98
```
