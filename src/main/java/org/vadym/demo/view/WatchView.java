package org.vadym.demo.view;

import org.vadym.demo.WatchType;
import org.vadym.demo.model.Watch;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WatchView {
    private Scanner scanner;

    public WatchView() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n-------Watch Store------");
        System.out.println("1. Show all watches");
        System.out.println("2. Sort by price");
        System.out.println("3. Sort by color");
        System.out.println("4. Sort by arrival date");
        System.out.println("5. Show total value");
        System.out.println("6. Add new watch");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");
    }

    public int getUserChoice() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            return -1;
        }
    }

    public void displayWatches(List<Watch> watches) {
        if (watches.isEmpty()) {
            System.out.println("Store is empty");
            return;
        }

        System.out.println("\n" + "=".repeat(20));

        for (Watch watch : watches) {
            System.out.println(watch);
        }

        System.out.println("\n" + "=".repeat(20));
    }

    public void displayTotalValue(double totalValue) {
        System.out.printf("%nTotal value of all items: %.2f UAH%n", totalValue);
    }

    public Watch addWatch() {
        scanner.nextLine();

        System.out.println("\nAdding new watch:");
        System.out.println("Watch types:");
        WatchType[] types = WatchType.values();
        for (int i = 0; i < types.length; i++) {
            System.out.println((i + 1) + ". " + types[i].getDisplayedName());
        }
        System.out.print("Choose type 1-" + types.length + ":");

        int choice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (choice < 0 || choice >= types.length) {
            throw new IllegalArgumentException("Invalid watch type");
        }

        WatchType type = types[choice];

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter material: ");
        String material = scanner.nextLine();

        System.out.print("Is waterproof? (yes/no): ");
        boolean waterproof = scanner.nextLine().toLowerCase().startsWith("y");

        LocalDate arrivalDate = LocalDate.now();

        return new Watch(type, brand, price, color, arrivalDate, material, waterproof);
    }

    public void close() {
        scanner.close();
    }
}
