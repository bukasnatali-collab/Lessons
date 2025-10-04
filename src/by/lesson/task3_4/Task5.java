package by.lesson.task3_4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную.
        // Иначе если a=b  вывести сумму этих чисел.
        // Иначе вывести разность b-a. Результат вычисления передать в новую переменную.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();

        if (a > b) {
            int c = a - b;
            System.out.print(c);
        } else if (a == b) {
            int d = a + b;
            System.out.print(d);
        } else {
            int i = b - a;
            System.out.print(i);
        }
    }
}