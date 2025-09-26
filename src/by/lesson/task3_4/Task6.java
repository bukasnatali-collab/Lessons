package by.lesson.task3_4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
        // Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();

        if (a > b & b != 0) {
            System.out.print(a / b);
        } else if (a != 0) {
            System.out.print(b / a);
        } else {
            System.out.print(a + b);
        }
    }
}