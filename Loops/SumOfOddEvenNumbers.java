import java.util.*;
public class SumOfOddEvenNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numbers = 0;
            boolean check = true;
            int oddNumbers = 0;
            int evenNumbers = 0;
            do { 
                System.out.print("Enter a number :");
                numbers = sc.nextInt();
                if(numbers%2==0){
                    evenNumbers += numbers;
                }
                else{
                    oddNumbers += numbers;
                }
                System.out.print("Do you want to continue enter 0 for yes and no for 1 ");
                int input = sc.nextInt();
                if(input == 1){
                    check = false;
                }
            }while(check==true);
            System.out.println("Sum of All Even Numbers you Entered is :"+evenNumbers);
            System.out.println("Sum of All Odd Numbers you Entered is :"+oddNumbers);
        }
    }
}
