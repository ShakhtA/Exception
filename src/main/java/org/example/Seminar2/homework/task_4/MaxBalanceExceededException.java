package org.example.Seminar2.homework.task_4;

/*
выбрасывается при попытке пополнения счета, превышающего максимальное допустимое значение баланса
 */

public class MaxBalanceExceededException extends Exception{

    public MaxBalanceExceededException(String message) {
        super(message);
    }
}
