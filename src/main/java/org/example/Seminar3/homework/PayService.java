package org.example.Seminar3.homework;

public class PayService {

    /**
     * Платежный сервис
     */

    /**
     * Оплата заказа
     * @param summa - сумма к оплате
     */
    public static void transaction (double summa) throws InsufficientFundsException{

        if (summa > Client.getBalance()) throw new InsufficientFundsException("На счете недостаточно средств");
        Client.changeBalance(summa);
        System.out.println("Товар оплачен.");
    }
}
