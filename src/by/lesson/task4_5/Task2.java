package by.lesson.task4_5;

public class Task2 {
    // Необходимо вывести следующую последовательность цифр:
// 1 2 4 8 16 32 64 128 256 512 (цикл while)


    public static void main(String[] args) {

        int number = 1;

        do {
            System.out.print(number + " ");
            number = number * 2;
        } while (number <= 512);
    }
}
