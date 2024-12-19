import java.util.*;
public class Pq1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a Number :");
            int number = sc.nextInt();
            if(number<0){
                System.out.println(number+" is Negative Number");
            }
            else{
                System.out.println(number+" is Positive Number");
            }
            sc.close();
        }
    }
}
