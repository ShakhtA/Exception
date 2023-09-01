package org.example.Seminar2.homework.task_3;

import java.util.Scanner;

/*
Задача3:

Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений

*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //System.out.println("Введите первое число: ");
            System.out.println("Введите три числа: ");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();

            if (number1 > 100) throw new NumberOutOfRangeException("Первое число вне допустимого диапазона.");
            //System.out.println("Введите второе число: ");
            //int number2 = scanner.nextInt();
            if (number2 < 0) throw new NumberOutOfRangeException("Второе число вне допустимого диапазона.");
            if (number1 + number2 < 10) throw new NumberSumException("Сумма первого и второго чисел слишком мала.");

//            System.out.println("Введите третье число: ");
//            int number3 = scanner.nextInt();
            if (number3 == 0) throw new DivisionByZeroException("Деление на ноль недопустимо.");

            System.out.println("Проверка проведена успешно");
        } catch (NumberOutOfRangeException | DivisionByZeroException | NumberSumException ex) {
            System.out.println(ex.getMessage());
        }   finally {
            System.out.println("\nКонец программы");
        }
    }
}
