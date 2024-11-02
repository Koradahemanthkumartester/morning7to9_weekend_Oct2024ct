package nov1st2024;

import java.util.Scanner;

public class CalculatorAssignment {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Error! Operator is not correct");
                    return;
            }

            System.out.println("The result is: " + result);
        }

        // Method to add two numbers
        public static double add(double a, double b) {
            return a + b;
        }

        // Method to subtract two numbers
        public static double subtract(double a, double b) {
            return a - b;
        }

        // Method to multiply two numbers
        public static double multiply(double a, double b) {
            return a * b;
        }

        // Method to divide two numbers
        public static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Error! Division by zero is not allowed.");
                return 0;
            }
            return a / b;
        }
    }


