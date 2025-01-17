import java.util.*;
public class CheckPrime {
    public static boolean checkPrime(int number){
        int counter = 2;
        while(counter<=Math.sqrt(number)){
            if(number%counter==0){
                return false;
            }
            else{
                counter++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(checkPrime(num)==true){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }
    }
}
