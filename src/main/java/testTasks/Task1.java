package testTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое число");
        int number = input.nextInt();
        int controlNumber = 7;
        String result = (number > controlNumber) ? "Привет" : "Попробуйте ещё";
        System.out.println(result);
    }
}
