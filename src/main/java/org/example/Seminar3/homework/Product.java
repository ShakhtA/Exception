package org.example.Seminar3.homework;


public class Product {

    /**
     * Продукт
     */
    private static int counter;
    /**
     * id продукта
     */
    private int productId;
    /**
     * наименование продукта
     */
    private String name;
    /**
     * количество продукта
     */
    private int availableQuantity;
    /**
     * цена продукта
     */
    private double price;

    static {
        counter = 1001;
    }

    /**
     * конструктор класса
     * @param name
     * @param availableQuantity
     * @param price
     */
    public Product(String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
        productId = counter++;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "id: " + productId + " " + name + " available quantity: " + availableQuantity +
                " price: " + price;
    }
}
