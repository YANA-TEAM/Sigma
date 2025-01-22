<<<<<<< HEAD
import java.util.*;
public class ContinueKeywordQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter a Number :");
            int number = sc.nextInt();
            if(number%10==0){
                continue;
            }
            System.out.println("you entered "+number);
        } while (true);
=======
import java.util.Scanner;

public class ContinueKeywordQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;




        
        while (true) { 
            System.out.print("Enter a Number :");
            number = sc.nextInt();
            if(number%10==0){
                continue;
            }
            
        }
>>>>>>> ba890ff5ab377211c40426e711c28e013e336ccc
    }
}