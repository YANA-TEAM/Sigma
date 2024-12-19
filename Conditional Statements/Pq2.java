import java.util.*;
public class Pq2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            double temp = 103.5;
           String feverChecker = (temp<=100?"You Not Have A Fever":"You Have a Fever");
           System.out.println(feverChecker);
            sc.close();
        }
    }    
}