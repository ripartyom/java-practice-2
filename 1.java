package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Массив: " + Arrays.toString(numbers));

        System.out.println("1 — добавить элемент");
        System.out.println("2 — удалить элемент");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введите число:");
            int number = scanner.nextInt();

            int[] newNumbers = new int[numbers.length + 1];

            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i];
            }

            newNumbers[numbers.length] = number;

            System.out.println("Новый массив: " + Arrays.toString(newNumbers));

        } else if (choice == 2) {
            System.out.println("Введите индекс элемента:");
            int index = scanner.nextInt();

            if (index < 0 || index >= numbers.length) {
                System.out.println("Ошибка: индекс выходит за границы массива");
                return;
            }

            int[] newNumbers = new int[numbers.length - 1];

            for (int i = 0, j = 0; i < numbers.length; i++) {
                if (i != index) {
                    newNumbers[j] = numbers[i];
                    j++;
                }
            }

            System.out.println("Новый массив: " + Arrays.toString(newNumbers));

        } else {
            System.out.println("Неверный выбор. Введите 1 или 2");
        }
    }
}
