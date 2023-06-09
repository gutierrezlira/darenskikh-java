package org.aston;

import java.io.Console;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8));

        System.out.println("Выберите задание (1-3): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                greaterThanSeven();
                break;
            case 2:
                greeting();
                break;
            case 3:
                array();
                break;
            default:
                System.out.println("Некорректный выбор");
        }

    }

    private static void greaterThanSeven() {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Введите число (или 0 для выхода): ");
            number = scanner.nextInt();

            if (number > 7) {
                System.out.println("Привет");
            }
        } while (number != 0);
    }

    private static void greeting() {
        String name;
        System.out.print("Введите имя: ");
        Console console = System.console();

        if (console != null) {
            name = console.readLine().trim();
        }else{
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
        } if (name.equalsIgnoreCase("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    private static void array() {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Введите длину массива (больше 0): ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] arr = new int[n];
        System.out.print("Введитеэлементов массива: ");

        int i;
        for (i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Элементы массива, кратные 3:");

        for (i = 0; i < n; ++i) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
