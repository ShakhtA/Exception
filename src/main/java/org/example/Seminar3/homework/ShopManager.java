package org.example.Seminar3.homework;

import java.util.InputMismatchException;

public class ShopManager {

    /**
     * Покупка продукта
     * @param productId - id продукта
     * @param quantity - количество продукта
     * @return totalPrice - сумма к оплате
     *
     */
    public static double purchaseProduct(int productId, int quantity) throws ProductIsNotFound, InsufficientProductException {

       Product product = ProductDatabase.getProduct(productId);
       if (product == null) throw new ProductIsNotFound(String.format("Товар с id_%d is не найден", productId));
       else {
           if (quantity > product.getAvailableQuantity()) throw new InsufficientProductException("Недостаточно товара");
           else {
               double totalPrice = product.getPrice() * quantity;
               return totalPrice;
           }
       }
    }
}


