import java.util.*;
public class TotalCostWithGst{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost of Pencil :");
        double pencil = sc.nextDouble();
        System.out.print("Enter Cost of Pen :");
        double pen = sc.nextDouble();
        System.out.print("Enter Cost of Eraser :");
        double eraser = sc.nextDouble();
        double totalCost = (pencil+pen+eraser);
        double totalCostWithGst = totalCost+(0.18*totalCost);
        System.out.println("Total Cost is :"+totalCost);
        System.out.println("Total Cost with Gst is :"+totalCostWithGst);
        sc.close();
    }
}