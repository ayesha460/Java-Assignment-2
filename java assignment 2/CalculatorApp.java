import java.util.Scanner;

public class CalculatorApp {

    // ----- Calculator Class -----
    static class Calculator {

        // Overloaded add methods
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Subtract method
        public int subtract(int a, int b) {
            return a - b;
        }

        // Multiply method
        public double multiply(double a, double b) {
            return a * b;
        }

        // Divide method with exception handling
        public double divide(int a, int b) {
            try {
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero!");
                }
                return (double) a / b;
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                return 0;
            }
        }
    }

    // ----- User Interface Section -----
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;

        System.out.println("===== Welcome to the Calculator Application! =====");

        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nChoose addition type:");
                    System.out.println("1. Two integers");
                    System.out.println("2. Two doubles");
                    System.out.println("3. Three integers");
                    System.out.print("Enter your choice: ");
                    int addChoice = sc.nextInt();

                    switch (addChoice) {
                        case 1:
                            System.out.print("Enter first integer: ");
                            int a1 = sc.nextInt();
                            System.out.print("Enter second integer: ");
                            int b1 = sc.nextInt();
                            System.out.println("Result: " + calc.add(a1, b1));
                            break;

                        case 2:
                            System.out.print("Enter first double: ");
                            double a2 = sc.nextDouble();
                            System.out.print("Enter second double: ");
                            double b2 = sc.nextDouble();
                            System.out.println("Result: " + calc.add(a2, b2));
                            break;

                        case 3:
                            System.out.print("Enter three integers: ");
                            int x = sc.nextInt();
                            int y = sc.nextInt();
                            int z = sc.nextInt();
                            System.out.println("Result: " + calc.add(x, y, z));
                            break;

                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    System.out.print("\nEnter first integer: ");
                    int s1 = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int s2 = sc.nextInt();
                    System.out.println("Result: " + calc.subtract(s1, s2));
                    break;

                case 3:
                    System.out.print("\nEnter first double: ");
                    double m1 = sc.nextDouble();
                    System.out.print("Enter second double: ");
                    double m2 = sc.nextDouble();
                    System.out.println("Result: " + calc.multiply(m1, m2));
                    break;

                case 4:
                    System.out.print("\nEnter first integer: ");
                    int d1 = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int d2 = sc.nextInt();
                    double result = calc.divide(d1, d2);
                    System.out.println("Result: " + result);
                    break;

                case 5:
                    System.out.println("Exiting... Thank you for using the Calculator!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
