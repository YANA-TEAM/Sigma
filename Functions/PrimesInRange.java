import java.util.Scanner;

public class PrimesInRange {

    // Method to check if a number is prime
    public static boolean checkPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime numbers
        if (number == 2) return true; // 2 is a prime number
        if (number % 2 == 0) return false; // Even numbers greater than 2 are not prime

        for (int counter = 3; counter <= Math.sqrt(number); counter += 2) {
            if (number % counter == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print all primes in the range [1, number]
    public static void primesInRange(int number) {
        for (int i = 2; i <= number; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper limit to find prime numbers: ");
        int num = sc.nextInt();

        System.out.println("All Prime Numbers From 1 to " + num + " are:");
        primesInRange(num);

        sc.close();
    }
}
