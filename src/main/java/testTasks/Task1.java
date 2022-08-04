package testTasks;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое число");
        String inputString = input.nextLine();
        inputString = inputString.replaceAll("\\s+", "").trim();//удаляем пробелы внутри и снаружи
        if (inputString.matches("[0-9][0-9]*\\.[0-9][0-9]*|[0-9][0-9]*")) { //применяем регулярное выражение для отсечения букв и других символов
            double number = Double.parseDouble(inputString);
            double controlNumber = 7.0;
            String result = (number > controlNumber) ? "Привет" : "Число меньше либо равно 7";
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