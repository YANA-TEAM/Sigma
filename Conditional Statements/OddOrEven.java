import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number :");
            int number = sc.nextInt();
            if(number%2==0){
                System.out.println(number+" is Even");
            }
            else{
                System.out.println(number+" is Odd");
            }
            sc.close();
        }
    }
}
