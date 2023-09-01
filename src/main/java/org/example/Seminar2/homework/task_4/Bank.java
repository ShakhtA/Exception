package org.example.Seminar2.homework.task_4;
import java.util.HashMap;
import java.util.Map;
public class Bank {

    private Map<Integer, BankAccount> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public Map<Integer, BankAccount> getAccounts() {
        return accounts;
    }



    public void setAccounts(BankAccount bankAccount) {
        accounts.put(bankAccount.getAccountNumber(), bankAccount);
    }

    /**
     * Создание нового аккаунта
     */
    public void createAccount() {
        setAccounts(new BankAccount());
    }

    public void createAccount(int sum) {
        setAccounts(new BankAccount(sum));
    }

    /**
     * Перевод денег со счета на счет
     * @param from счет-отправитель
     * @param to - счет-получатель
     * @param sum - сумма перевода
     */
    public void transaction(int from, int to, int sum) {
        try {
            if (sum > accounts.get(from).getBalance()) throw new InsufficientFundsException("На счете недостаточно средств");
            else if (accounts.get(to).getBalance() + sum > BankAccount.LIMITBALANCE)
                    throw  new MaxBalanceExceededException("Превышено максимально допустимое значение баланса");
                 else{
                    withdrawFromAccount(from, sum);
                    creditToAccount(to, sum);
                    System.out.println("Операция по переводу денег выполнена успешно");
                    System.out.println("=".repeat(20));
                }
        }catch (MaxBalanceExceededException | InsufficientFundsException ex) {
            System.out.println("Операция не выполнена");
            System.out.println(ex.getMessage());
            System.out.printf("Баланс счета №%s = %d р.\n", from, accounts.get(from).getBalance());
            System.out.printf("Баланс счета №%s = %d р.\n", to, accounts.get(to).getBalance());
        }
    }

    /**
     * Списать со счета
     * @param account - счет списания
     * @param sum - счет зачисления
     */
    public void withdrawFromAccount(int account, int sum) {
        try {
            accounts.get(account).removeMoney(sum);
            System.out.printf("Со счета №%s списано %d р.\n", account, sum);
            System.out.printf("Баланс счета №%s = %d р.\n", account, accounts.get(account).getBalance());
            System.out.println("=".repeat(20));
        } catch (InsufficientFundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Пополнение счета
     * @param account - счет пополнения
     * @param sum - сумма пополнения
     */
    public void creditToAccount(int account, int sum) {
        try {
            accounts.get(account).addMoney(sum);
            System.out.printf("На счет №%s зачислено %d р.\n", account, sum);


        } catch (MaxBalanceExceededException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.printf("Баланс счета №%s = %d р.\n", account, accounts.get(account).getBalance());
            System.out.println("=".repeat(20));
        }

    }

    @Override
    public String toString() {
        return accounts.toString();
    }
}
