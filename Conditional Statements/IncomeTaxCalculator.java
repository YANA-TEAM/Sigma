import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your Salary :");
            double salary = sc.nextInt();
            double tax = 0;
            if(salary < 500000){
                tax = salary;
                System.out.println("Your Salary including tax is "+tax);
            }
            else if(salary>=500000 && salary<=1000000){
                tax = salary*0.2;
                System.out.println("Your Salary including tax is "+tax);
            }
            else{
                tax = salary*0.3;
                System.out.println("Your Salary including tax is "+tax);
            }
            sc.close();
        }
    }
}
