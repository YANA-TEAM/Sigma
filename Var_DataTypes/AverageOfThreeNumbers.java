import java.util.*;
public class AverageOfThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        double number1 = sc.nextDouble();
        System.out.print("Enter number 2 :");
        double number2 = sc.nextDouble();
        System.out.print("Enter number 3 :");
        double number3 = sc.nextDouble();
        double averageOfThreeNumbers = (number1+number2+number3)/3;
        System.out.println("Average of Three Numbers "+number1+","+number2+","+number3+" is "+averageOfThreeNumbers);
        sc.close();
    }
}