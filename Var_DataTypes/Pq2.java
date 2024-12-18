import java.util.*;
public class Pq2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the Side of a Square :");
        int side = sc.nextInt();
        int areaOfSquare = (side*side);
        System.out.println("Area of Square is "+areaOfSquare);
        sc.close();
        }
    }
}
