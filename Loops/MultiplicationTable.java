import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(number+"x"+i+"="+number*i);
        }
    }
}
