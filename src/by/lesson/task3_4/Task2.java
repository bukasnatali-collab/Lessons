package by.lesson.task3_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextDouble();
        System.out.println("Введите y");
        double y = in.nextDouble();
        System.out.println("Введите z");
        double z = in.nextDouble();

        // Используем операции присваивания
        x += y;  // x = x + y
        y *= z;  // y = y * z
        System.out.println(x + " " + y);
    }
}