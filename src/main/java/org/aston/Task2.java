package org.aston;

import java.io.Console;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
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
}
