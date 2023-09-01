package org.example.Seminar2;/*
Задача: Управление запасами в магазине

Вы разрабатываете программу для управления запасами товаров в магазине. Вам необходимо реализовать класс Product, представляющий товар, и класс Store, управляющий запасами товаров в магазине. Также требуется создать собственные классы исключений для обработки ситуаций, связанных с недостатком товаров и добавлением недопустимых значений.
*/

import java.util.HashMap;
import java.util.Map;

public class Product {

    private String name;    //  имя продукта
    private int quantity;   // количество продукта (?)

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Геттеры и сеттеры


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " - " + quantity + " шт.";
    }
}

class Store {
    private Map<String, Product> inventory;

    public Store() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getName(), product);
    }

    public Product getProduct(String name) {
        return inventory.get(name);
    }

    public void sellProduct(String name, int quantity) {
        Product product = getProduct(name);
        if (product != null && product.getQuantity() >= quantity) {
            product.setQuantity(product.getQuantity() - quantity);
            System.out.println("Товар '" + product.getName() + "' продан в количестве " + quantity + " шт.");
        } else {
            System.out.println("Товар '" + name + "' отсутствует на складе или недостаточно в наличии.");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Store store = new Store();
//
//        Product laptop = new Product("Ноутбук", 5);
//        store.addProduct(laptop);
//
//        Product retrievedLaptop = store.getProduct("Ноутбук");
//        System.out.println("Найден товар: " + retrievedLaptop);
//
//        store.sellProduct("Ноутбук", 3);
//        store.sellProduct("Ноутбук", 3); // Это вызовет отсутствие товара
//
//        Product phone = new Product("Смартфон", 10);
//        store.addProduct(phone);
//
//        store.sellProduct("Смартфон", 15); // Это вызовет недостаток товара
//    }
//}

/*
OutOfStockException: Это исключение можно бросить, когда клиент пытается приобрести товар, но его количество на складе равно нулю. Это поможет уведомить клиента о том, что товар временно отсутствует.

InvalidProductException: Если клиент пытается добавить продукт в корзину, который не существует в каталоге магазина, вы можете бросить это исключение, чтобы указать на недопустимый продукт.

InsufficientFundsException: Если у клиента недостаточно средств для совершения покупки, можно создать это исключение, чтобы сообщить о нехватке средств.

PaymentProcessingException: При обработке платежа может возникнуть ряд проблем, таких как проблемы с платежным шлюзом или недоступностью банковского сервера. Это исключение поможет обработать такие ситуации.

CouponExpiredException: Если в магазине используются купоны с определенным сроком действия, можно создать это исключение для обработки ситуации, когда купон уже истек.

OrderProcessingException: При обработке заказа могут возникнуть различные проблемы, связанные с инвентарем, оплатой, доставкой и т.д. Это исключение поможет управлять ошибками в процессе обработки заказа.

ShippingAddressException: Если клиент вводит некорректный адрес доставки, вы можете бросить это исключение, чтобы попросить его ввести правильные данные.

InvalidQuantityException: Если клиент указывает отрицательное количество товара при добавлении его в корзину или оформлении заказа, вы можете использовать это исключение.

DiscountCalculationException: Если у вас есть сложная логика расчета скидок и она не может быть выполнена, можно создать это исключение для указания на проблему в расчетах скидок.

ProductReviewException: Если клиент пытается оставить отзыв о продукте, но его отзыв не соответствует определенным критериям (например, слишком короткий), вы можете использовать это исключение.
*/