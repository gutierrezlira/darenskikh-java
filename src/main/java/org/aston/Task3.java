package org.aston;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.printf("Введите элементы массива: ");

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
