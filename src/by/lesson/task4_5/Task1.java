package by.lesson.task4_5;

public class Task1 {
    // Необходимо, чтобы программа отображала следующую последовательность чисел:
    // 7 14 21 28 35 42 49 56 63 70 77 84 91 98

    public static void main(String[] args) {
        int number = 7;

        do {
            System.out.print(number + " ");
            number += 7;
        }
        while (number <= 98);
    }
}
