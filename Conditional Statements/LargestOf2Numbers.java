import java.util.*;
public class LargestOf2Numbers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number 1 :");
            int num1 = sc.nextInt();
            System.out.print("Enter Number 2 :");
            int num2 = sc.nextInt();
            if(num1>num2){
                System.out.println("Largest Number is "+num1);
            }
            else{
                System.out.println("Largest Number is "+num2);
            }
            sc.close();
        }
    }
}
