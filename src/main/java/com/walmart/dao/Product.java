package com.walmart.dao;

public class Product {

    // Private fields
    private long productId;
    private String productName;
    private double price;

    // Protected field
    protected int quantityInStock;

    // Public static constant
    public static final String CATEGORY = "Produce";

    // Default constructor
    public Product() {
        // Default constructor
    }

    // Parameterized constructor
    public Product(long productId, String productName, double price, int quantityInStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // Public getter and setter methods for productId
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    // Public getter and setter methods for productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Public getter and setter methods for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Protected getter and setter methods for quantityInStock
    protected int getQuantityInStock() {
        return quantityInStock;
    }

    protected void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    // Public method to display product information
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
        System.out.println("Category: " + CATEGORY);
    }
}

