package testTasks;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[12]; // создаём массив на 12 элементов

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // заполняем массив случайными числами от 1 до 100
        }

        System.out.print("Числовой массив: ");

        for (int number : numbers) {
            System.out.print(number); // циклом для каждого выводим элементы массива
            System.out.print(" "); // пробелы между элементами массива (можно было добавить сверху)
        }

        System.out.println();
        System.out.print("Элементы массива кратные 3: ");

        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.print(number); // циклом для каждого выводим только те элементы массива которые делятся на 3 без остатка
                System.out.print(" ");
            }
        }
    }
}
