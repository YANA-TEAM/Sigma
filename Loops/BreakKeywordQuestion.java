import java.util.*;
public class BreakKeywordQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (true) { 
            System.out.print("Enter a Number :");
            number = sc.nextInt();
            if(number%10==0){
                break;
            }
        }
        sc.close();
    }
}
