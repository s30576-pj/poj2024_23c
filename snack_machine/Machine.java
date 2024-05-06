package org.example;

import java.util.Scanner;

public class Machine {
    private final Scanner scanner;

    public Machine(Scanner scanner) {
        this.scanner = scanner;
    }
    public void start() {
        System.out.println("Select the payment currency:");
        for (Currency currency : Currency.values()) {
            System.out.println(currency.ordinal() + ". " + currency);
        }
        System.out.print("Select the currency number (default is PLN): ");
        int currencyOfChoiceIndex = scanner.nextInt();
        Currency currencyOfChoice = Currency.values()[currencyOfChoiceIndex];

        while (true) {
            System.out.println("Hello!");
            System.out.println("Products available:");
            for (Product product : Product.values()) {
                System.out.println(product.getNumber() + ". " + product.getName() + " - " + product.getPrice() + " PLN");
            }
            System.out.print("Select the product number (or enter '0' to finish): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Thank you for using our machine!");
                break;
            } else {
                Product selectedProduct = null;
                for (Product product : Product.values()) {
                    if (product.getNumber() == choice) {
                        selectedProduct = product;
                        break;
                    }
                }
                if (selectedProduct != null) {
                    System.out.println("Selected: " + selectedProduct.getName());
                    System.out.println("Price: " + selectedProduct.getPrice() + " PLN");
                    System.out.print("Enter the amount in " + currencyOfChoice + ": ");
                    double amount = scanner.nextDouble();
                    double amountPLN = amount * currencyOfChoice.getCourse();
                    if (amountPLN < selectedProduct.getPrice()) {
                        System.out.println("Too small an amount! Please enter the appropriate amount.");
                    } else {
                        double change = amountPLN - selectedProduct.getPrice();
                        System.out.println("Thank you for your purchase " + selectedProduct.getName() + ".");
                        System.out.println("Your change: " + change + " PLN");
                    }
                } else {
                    System.out.println("Incorrect product number! Please try again.");
                }
            }
        }
    }
}