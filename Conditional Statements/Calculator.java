import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Welcome To Calculator!!");
            System.out.print("Enter Number 1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter Number 2 : ");
            int num2 = sc.nextInt();
            System.out.println("Enter Character to Perform Operation your Given Numbers");
            System.out.println("For Addition Enter +");
            System.out.println("For Substraction Enter -");
            System.out.println("For Multplication Enter *");
            System.out.println("For Division Enter /");
            System.out.print("Enter your operator : ");
            char operator = sc.next().charAt(0);
            switch (operator) {
                case '+' -> System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
                case '-' -> System.out.println("Substraction of "+num1+" and "+num2+" is "+(num1-num2));
                case '*' -> System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
                case '/' -> System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
                default -> {
                    System.out.println("Enter Correct Operator");
                }

            }
            sc.close();
        }
    }
}
