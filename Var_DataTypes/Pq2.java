import java.util.*;
public class Pq2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of a Square :");
        int side = sc.nextInt();
        int areaOfSquare = (side*side);
        System.out.println("Area of Square is "+areaOfSquare);
    }
}
