import java.util.*;
public class Pq3 {
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.print("Enter the cost of Pencil :");
           float pencil = sc.nextFloat();
           System.out.print("Enter the cost of Pen :");
            float pen = sc.nextFloat();
            System.out.print("Enter the cost of Eraser :");
            float eraser = sc.nextFloat();
            float amount = (pencil+pen+eraser);
            float gstAmount = (amount)*1.18f;
            float totalAmount = amount+gstAmount;
            System.out.println("Total Cost with 18% gst is "+totalAmount);
           sc.close();
       }
   } 
}
