package org.example.Seminar2.homework.task_4;

/*
Создание многопоточной программы для обработки банковских транзакций с использованием пользовательских классов исключений.
__
Описание задачи:
Вы разрабатываете многопоточную программу для обработки банковских транзакций. Вам необходимо реализовать класс "BankAccount",
оторый представляет счет в банке и содержит баланс пользователя. Класс "BankAccount" должен поддерживать две операции:
пополнение счета и снятие денег.
Однако, у каждого счета есть ограничение по максимальному балансу, и попытка пополнения или снятия средств,
превышающих это ограничение, должна вызывать соответствующее исключение.
__
Вам также необходимо реализовать класс "Bank" для управления счетами и обработки транзакций.
Класс "Bank" должен содержать методы для создания новых счетов, пополнения и снятия денег с счетов.
__
Для обработки ошибок исключений, вы должны создать два пользовательских класса исключений:
__
"InsufficientFundsException" - выбрасывается при попытке снятия средств, превышающих доступный баланс на счете.
"MaxBalanceExceededException" - выбрасывается при попытке пополнения счета, превышающего максимальное допустимое значение баланса.
Класс "Bank" должен использовать многопоточность, чтобы обрабатывать транзакции с разных счетов параллельно.
 */

public class Main {
    public static void main(String[] args) {

//        BankAccount account1 = new BankAccount();
//        System.out.println(account1);
//        BankAccount account2 = new BankAccount();
//        System.out.println(account2);
//        account1.setBalance(100);
//        System.out.println(account1);
//        account1.setBalance(account1.getBalance() + 10);
//        System.out.println(account1);

        Bank bank = new Bank();
        bank.createAccount();
        System.out.println(bank);
        bank.createAccount();
        System.out.println(bank);
        bank.creditToAccount(1001, 40_000);
        bank.creditToAccount(1002, 80_000);
        bank.transaction(1002, 1001, 70_000);


    }
}
