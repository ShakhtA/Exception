package org.example.Seminar2.homework.task_4;

/*
выбрасывается при попытке снятия средств, превышающих доступный баланс на счете
 */

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
