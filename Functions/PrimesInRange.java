import java.util.*;

public class PrimesInRange {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Even numbers greater than 2 are not prime
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false; // Divisible by other numbers
            }
        }
        return true; // Number is prime
    }

    public static void primesInRange(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i); // Print prime numbers
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a range of prime numbers: ");
        int range = sc.nextInt();
        System.out.println("All Prime Numbers from 1 to " + range + " are:");
        primesInRange(range);
    }
}
