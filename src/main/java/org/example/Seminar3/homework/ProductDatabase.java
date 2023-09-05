package org.example.Seminar3.homework;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {

    /**
     * база данных
     */
    private static Map<Integer, Product> products;

    /**
     * метод возвращает базу данных
     * @return
     */
    public static void getProducts() {
        for (Product product: products.values()) {
            System.out.println(product);
        }
    }

    /**
     * добавление продукта в базу данных
     * @param product
     */
    public static void addProduct(Product product) {
        if (products == null) {
            products = new HashMap();
        }
        products.put(product.getProductId(), product);
    }

    /**
     * метод позволяет получить продукт по его id
     * @param productId - id продукта
     * @return
     */
    public static Product getProduct(int productId) throws ProductIsNotFound {
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        Product product = null;
        if (!products.containsKey(productId)) {
            throw new ProductIsNotFound(String.format("Продукт с id_%d не найден", productId));
        }
        else return products.get(productId);
    }
}
