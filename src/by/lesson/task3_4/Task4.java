package by.lesson.task3_4;

public class Task4 {
    public static void main(String[] args) {
        // Даны значения: x=5; y=2; c=x*y;
        // Расставьте операции инкремента декремента так, чтобы после выполнения операции (c=x*y) с=10; x=6; y=1

        int x3 = 5;
        int y = 2;
        int c = x3++ * y--;  // Добавлены операции инкремента/декремента

        System.out.println("c = " + c + " x3 = " + x3 + " y = " + y);
    }
}