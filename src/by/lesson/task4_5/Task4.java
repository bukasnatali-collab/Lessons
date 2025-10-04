package by.lesson.task4_5;

public class Task4 {
    // Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой (while)

    public static void main(String[] args) {
        int number = 100;

        while (number >= 1) {

            switch (number) {
                case 1:
                    System.out.print(number);
                    break;
                default:
                    System.out.print(number + ", ");
                    break;
            }

            number = number - 1;
        }
    }
}
