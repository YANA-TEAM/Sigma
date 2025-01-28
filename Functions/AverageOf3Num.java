import java.util.*;
public class AverageOf3Num {
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Average of 3 numbers: " + average(a, b, c));
    }
}
