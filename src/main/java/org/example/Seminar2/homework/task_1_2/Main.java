package org.example.Seminar2.homework.task_1_2;


import java.util.Scanner;
import static org.example.Seminar2.homework.task_1_2.IsNumberPositiv.isNumberPositiv;
import static org.example.Seminar2.homework.task_1_2.DivizionByZero.divisionByZero;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        int number = scanner.nextInt();
        try {
            isNumberPositiv(number);
        } catch (InvalidNumberException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Задание 1 выполнено.\n");
        }

        // Задание 2
        System.out.println("Введите делимое: ");
        int dividend = scanner.nextInt();
        System.out.println("Введите делитель: ");
        int divisor = scanner.nextInt();
        divisionByZero(dividend, divisor);
    }
}

