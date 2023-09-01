package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите любую клавишу");

        while (true) {
            try {

                String str = scanner.nextLine();
                System.out.println("Введите x: ");
                int x = scanner.nextInt();
                System.out.println("Введите y: ");
                double y = scanner.nextDouble();

                double result = (double) x / y;
                System.out.println(result);
                //                return result;
                break;
            }

            catch (ArithmeticException e) {
                System.out.println("На ноль делить нельзя");
            }
            catch (InputMismatchException exception) {
                System.out.println("Некорректный ввод!");
            }
        }

            System.out.println("Конец программы");

    }
}
//    public static double test() {
//        while (true) {
//            try {
//                System.out.println("Введите делимое: ");
//                double x = scanner.nextDouble();
//                double y = scanner.nextDouble();
//                double result = x / y;
//                return result;
//            }
//            catch (ArithmeticException exception) {
//                System.out.println("На ноль делить нельзя!");
//            }
//            catch (InputMismatchException exception) {
//                System.out.println("Некорректный ввод!");
//            }
//        }
//    }
