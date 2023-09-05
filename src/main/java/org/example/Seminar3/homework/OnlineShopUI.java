package org.example.Seminar3.homework;

import java.util.Scanner;

/*
Создайте иерархию классов для интернет-магазина, как в примере .
Реализуйте методы для обработки покупок и доступа к данным о продуктах.
Добавьте исключения на каждый уровень абстракции для обработки возможных ошибок, например, если товар не найден.****
Дополнительно, вы можете добавить дополнительные уровни абстракции, такие как уровень оплаты и доставки,
и реализовать обработку исключений и на этих уровнях.
 */

public class OnlineShopUI {
    public static void main(String[] args) {
        Product product1 = new Product("product 1", 10, 23.99);
        ProductDatabase.addProduct(product1);
        ProductDatabase.getProducts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для продолжения нажмите ENTER");
        String pause = scanner.nextLine();
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        try {
            double totalPrice = ShopManager.purchaseProduct(productId, quantity);
            System.out.println("Total price: $" + totalPrice);
            PayService.transaction(totalPrice);
        }
        catch (ProductIsNotFound ex) {
            System.out.println(ex.getMessage());
        }
        catch (InsufficientProductException ex) {
            System.out.println(ex.getMessage());
        }
        catch (InsufficientFundsException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
