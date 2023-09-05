package org.example.Seminar3.homework;


public class Client {
    private static double balance = 100_000.0;

    public static double getBalance() {
        return balance;
    }

    public static void changeBalance(double summa) throws InsufficientFundsException {
        if (summa > balance) throw new InsufficientFundsException("На счете недостаточно средств");
        else balance = balance - summa;
    }
}
