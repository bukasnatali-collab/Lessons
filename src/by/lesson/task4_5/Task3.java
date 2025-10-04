package by.lesson.task4_5;

public class Task3 {
    // Написать программу, которая посчитает сумму первых 10 чисел (цикл while)

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println("Сумма первых 10 чисел: " + sum);
    }
}
