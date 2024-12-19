import java.util.*;
public class Pq5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Year to Check that it is Leap year or not :");
            int year = sc.nextInt();
            boolean leap = ((year%4==0)&&(year%100==0)&&(year%100!=0)&&(year%400==0));
            if(leap == true){
                System.out.println(year+" is leap year");
            }
            else{
                System.out.println(year+" is not year");                
            }
            sc.close();
        }
    }
}
