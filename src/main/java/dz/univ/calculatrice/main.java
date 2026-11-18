package dz.univ.calculatrice;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculator CLI ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.print("Choose an operation: ");

        final int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        final double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        final double b = scanner.nextDouble();

        final Operation operation;

        if (choice == 1) {
            operation = new addoperation();
        } else if (choice == 2) {
            operation = new subtractoperation();
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        final double result = operation.execute(a, b);

        System.out.println(
            a + " " + operation.getSymbol() + " " + b + " = " + result
        );

        scanner.close();
    }
}
