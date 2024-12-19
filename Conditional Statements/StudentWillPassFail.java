import java.util.*;
public class StudentWillPassFail {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Marks of Science :");
            int science = sc.nextInt();
            System.out.print("Enter Marks of Maths :");
            int maths = sc.nextInt();
            System.out.print("Enter Marks of English :");
            int english = sc.nextInt();
            String scienceCheck = (science<34?"FAIL IN SCIENCE":"PASS IN SCIENCE");
            String mathsCheck = (maths<34?"FAIL IN MATHS":"PASS IN MATHS");
            String englishCheck = (english<34?"FAIL IN ENGLISH":"PASS IN ENGLISH");
            System.out.println(scienceCheck);
            System.out.println(mathsCheck);
            System.out.println(englishCheck);
            sc.close();
        }
    }
}
