package org.example.Seminar3.homework;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) {
        Product product = ProductDatabase.getProduct(productId);
        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}
