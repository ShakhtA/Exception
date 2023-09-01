package org.example.Seminar2.homework.task_4;

public class BankAccount {

    private int accountNumber;
    private int balance;
    public static final  int LIMITBALANCE = 100_000;
    static int counter;

    static {
        counter = 1001;
    }

    public BankAccount() {
        this(0);
    }

    public BankAccount(int balance) {
        this.balance = balance;
        accountNumber = counter++;
    }

    public int getLimitBalance() {
        return LIMITBALANCE;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    /**
     * Пополнить счет
     * @param sum - сумма зачисления
     */
    public void addMoney(int sum) throws MaxBalanceExceededException {

        if (balance + sum > LIMITBALANCE) throw new MaxBalanceExceededException("Операция не выполнена. " +
                "Превышено максимально допустимое значение баланса.");
        else balance += sum;
    }

    /**
     * Снять со счета
     * @return sum - сумма снятия
     */
    public void removeMoney(int sum) throws InsufficientFundsException {

        if (sum > balance) throw new InsufficientFundsException("Операция не выполнена. На счете недостаточно средств.");
        else balance -= sum;
    }
    @Override
    public String toString() {
        return "accountNumber: " + accountNumber + ", balance:" + balance;
    }
}
