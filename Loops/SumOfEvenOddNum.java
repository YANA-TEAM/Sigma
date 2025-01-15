import java.util.*;
public class SumOfEvenOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenNum = 0;
        int oddNum = 0;
        boolean check = true;
        do { 
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            if (num%2==0) {
                evenNum+=num;
            } else {
                oddNum+=num;
            }
            System.out.print("Do you want to continue enter 1 for yes and 0 for no :");
            int checkNum = sc.nextInt();
            if (checkNum == 0) {
                check = false;
            }
        } while (check==true);
        System.out.println("Sum of All Even Numbers You Entered :"+evenNum);
        System.out.println("Sum of All Odd Numbers You Entered :"+oddNum);
    }
}
