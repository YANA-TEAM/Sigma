import java.util.*;

public class Factorial {
    public static int factorial(int number) {
        int fact = 1;
        // Loop from 1 to the given number
        for (int i = 1; i <= number; i++) {
            fact *= i; // Multiply fact by i
        }
        return fact;
    }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int input = sc.nextInt();  // Get the number from user input
        // facts = new Factorial();
        System.out.println("Factorial of " + input + " is " + factorial(input));
    }
}
