package testTasks;

import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя");
        String inputName = input.nextLine();
        String changeInputName = inputName.replaceAll("\\s+", "").trim();
        if (changeInputName.matches("[А-Я]*[а-я]*[А-Я]*[а-я]*[А-Я]*[а-я]*[А-Я]*[а-я]*[А-Я]*[а-я]*[А-Я]*[а-я]*[А-Я]*[а-я]*[А-Я]*[а-я]*")) {

            changeInputName = changeInputName.toLowerCase();

            changeInputName = changeInputName.substring(0, 1).toUpperCase() + changeInputName.substring(1);

            String expectedName = "Вячеслав";
            String result = (changeInputName.equals(expectedName)) ? "Привет, Вячеслав" : "Нет такого имени";
            System.out.println(result);
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Вы ввели недопустимые символы");
            }
        }
    }
}