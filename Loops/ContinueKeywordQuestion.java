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
    }
}