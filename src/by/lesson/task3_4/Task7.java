package by.lesson.task3_4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();

        if (a % 3 == 0) {
            System.out.println("Число " + a + " делится на три");
        } else {
            System.out.println("Число " + a + " не делится на три");
        }
    }
}