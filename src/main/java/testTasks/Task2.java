package testTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = input.nextLine();
        String expectedName = "Вячеслав";
        String result = (name.equals(expectedName)) ? "Привет, Вячеслав" : "Нет такого имени";
        System.out.println(result);
    }
}
