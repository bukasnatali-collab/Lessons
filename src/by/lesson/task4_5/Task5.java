package by.lesson.task4_5;

public class Task5 {
    // Создать массив из чисел. Вывести макс и мин число.

    public static void main(String[] args) {

        int[] numbers = {5, 12, -3, 8, 25, -7, 14, 0, 9};

        int max = numbers[0];
        int min = numbers[0];
        int i = 1;

        while (i < numbers.length) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i = i + 1;
        }

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }
}
