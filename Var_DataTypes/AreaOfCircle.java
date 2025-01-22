import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter radius of a Circle :");
         double radius = sc.nextDouble();
         double areaOfCircle = 3.14*(radius*radius);
         System.out.println("Area Of Circle is :"+areaOfCircle);
        sc.close();
    }
}