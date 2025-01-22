import java.util.*;
public class AreaOfSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Side of a Square :");
         double side = sc.nextDouble();
         double areaOfSquare = (side*side);
         System.out.println("Area Of Square is :"+areaOfSquare);
        sc.close();
    }
<<<<<<< HEAD
=======
}

class NoobAreaOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the side length from the user
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        // Calculate and display the area
        System.out.println("The area of the square is: " + (side * side));

        scanner.close();
    }
}

class ProAreaOfSquare {

    private static final Logger logger = Logger.getLogger(ProAreaOfSquare.class.getName());

    public static void main(String[] args) {
        try {
            displayWelcomeMessage();
            runCalculator();
        } catch (Exception e) {
            handleUnexpectedError(e);
        } finally {
            System.out.println("Thank you for using the Area Calculator. Goodbye!");
        }
    }

    private static void displayWelcomeMessage() {
        System.out.println("===========================================");
        System.out.println("         Welcome to Area Calculator         ");
        System.out.println("===========================================");
        System.out.println("This program calculates the area of a square.");
        System.out.println("Please enter the side length as a positive number.");
    }

    private static void runCalculator() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueCalculations = true;

            while (continueCalculations) {
                double sideOfSquare = getPositiveNumberInput(scanner, "Enter the side length of the square: ");
                double areaOfSquare = calculateAreaOfSquare(sideOfSquare);
                displayResult(sideOfSquare, areaOfSquare);
                continueCalculations = promptForAnotherCalculation(scanner);
            }
        }
    }

    private static double getPositiveNumberInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double input = scanner.nextDouble();
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Error: The number must be greater than 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input! Please enter a valid numeric value.");
                scanner.next();
            }
        }
    }

    private static double calculateAreaOfSquare(double sideOfSquare) {
        return Math.pow(sideOfSquare, 2);
    }

    private static void displayResult(double sideOfSquare, double areaOfSquare) {
        System.out.println("===========================================");
        System.out.printf("Side Length: %.2f units%n", sideOfSquare);
        System.out.printf("Area of Square: %.2f square units%n", areaOfSquare);
        System.out.println("===========================================");
    }

    private static boolean promptForAnotherCalculation(Scanner scanner) {
        while (true) {
            System.out.print("Would you like to calculate the area of another square? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();

            switch (response) {
                case "yes", "y" -> {
                    return true;
                }
                case "no", "n" -> {
                    return false;
                }
                default -> System.out.println("Invalid response! Please type 'yes' or 'no'.");
            }
        }
    }

    private static void handleUnexpectedError(Exception e) {
        System.err.println("An unexpected error occurred. Please try again later.");
        logger.log(Level.SEVERE, "An unexpected error occurred: " + e.getMessage(), e);
    }
>>>>>>> ba890ff5ab377211c40426e711c28e013e336ccc
}