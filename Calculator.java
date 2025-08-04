import java.util.Scanner;

public class Calculator {

    // Methods for operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("❌ Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("📟 Welcome to Java Console Calculator!");

        while (running) {
            System.out.println("\nChoose operation: +, -, *, / or type exit:");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                running = false;
                System.out.println("✅ Calculator exited.");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (operation) {
                case "+":
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case "/":
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("❗ Invalid operation.");
            }
        }

        scanner.close();
    }
}