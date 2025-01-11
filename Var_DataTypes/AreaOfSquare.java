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
}