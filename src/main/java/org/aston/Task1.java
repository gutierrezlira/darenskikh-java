package org.aston;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
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
}
