package org.example.Seminar2.homework.task_1_2;
import org.example.Seminar2.homework.task_1_2.InvalidNumberException;


/*
        Задача 1:
        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
        Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
        В противном случае, программа должна выводить сообщение "Число корректно".
*/
public class IsNumberPositiv {
    public  static void isNumberPositiv(int number) throws InvalidNumberException {

        if (number <= 0) throw new InvalidNumberException("Некорректное число.\n" +
                "Исключение InvalidNumberException в задаче 1 отработало.");
        else
            System.out.println("Число корректное");
    }
}
