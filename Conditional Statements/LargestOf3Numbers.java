import java.util.*;
public class LargestOf3Numbers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number 1 :");
            int num1 = sc.nextInt();
            System.out.print("Enter Number 2 :");
            int num2 = sc.nextInt();
            System.out.print("Enter Number 3 :");
            int num3 = sc.nextInt();
            if(num1>num2 && num1>num3){
                System.out.println("Largest Number is "+num1);
            }
            else if(num2>num1 && num2>num3){
                System.out.println("Largest Number is "+num2);
            }
            else{
                System.out.println("Largest Number is "+num3);
            }
            sc.close();
        }
    }
}
