package org.example.view;

import java.util.Scanner;

public class ApplianceView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Choose an appliance to control:");
        System.out.println("1. Light");
        System.out.println("2. Fan");
        System.out.println("3. Air Conditioner");
        System.out.println("4. Exit");
    }

    public void displaySubMenu() {
        System.out.println("Choose an action:");
        System.out.println("1. Turn on");
        System.out.println("2. Turn off");
        System.out.println("3. Exit");
    }

    public void displaySubMenuFan() {
        System.out.println("Choose an action:");
        System.out.println("1. Turn on");
        System.out.println("2. Turn off");
        System.out.println("3. Speed Up");
        System.out.println("4. Speed Down");
        System.out.println("5. Exit");
    }

    public int getUserSelection() {
        return scanner.nextInt();
    }
}