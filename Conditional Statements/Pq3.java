import java.util.*;
public class Pq3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter week number from 1-7 : ");
            int weekNum = sc.nextInt();
            switch (weekNum) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("!!!You enter wrong week Number plzz Enter from 1-7 only!!!");
            }
            sc.close();
        }
    }
}
