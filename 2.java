package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(101);
        int attempts = 0;

        while (attempts < 10) {
            System.out.println("Введите число от 1 до 100:");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Ошибка: число должно быть в диапазоне от 1 до 100");
                continue;
            }

            attempts++;

            if (guess < number) {
                System.out.println("Моё число больше, сделано " + attempts + " попыток");
            } else if (guess > number) {
                System.out.println("Моё число меньше, сделано " + attempts + " попыток");
            } else {
                System.out.println("Поздравляю! Вы угадали!");
                System.out.println("Вы угадали за " + attempts + " попыток");
                return;
            }
        }

        System.out.println("Вы исчерпали все попытки.");
        System.out.println("Загаданное число было " + number);
    }
}
