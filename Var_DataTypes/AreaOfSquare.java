import java.util.*;
public class AreaOfSquare{
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