package org.example.Seminar2.homework.task_1_2;

/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить результат деления.

 */

import org.example.Seminar2.homework.task_1_2.DivisionByZeroException;

public class DivizionByZero {

    public static void divisionByZero(int dividend, int divisor) {
        try {
            if (divisor == 0) throw new DivisionByZeroException("Деление на ноль недопустимо.\n" +
                    "Исключение DivisionByZeroException в задаче 2 отработало.");
            System.out.printf("%d / %d = %.2f\n", dividend, divisor, (float)dividend/divisor);
        } catch (DivisionByZeroException ex) {
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Задание 2 выполнено");
        }
    }
}
