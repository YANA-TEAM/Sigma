import java.util.*;

public class TotalCostWithGstCalculator {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            double pencilPrice = getPositiveNumberInput(scanner, "Enter Price of Pencil :");
            double penPrice = getPositiveNumberInput(scanner, "Enter Price of Pen :");
            double eraserPrice = getPositiveNumberInput(scanner, "Enter Price of Eraser :");
            double totalAmountWithoutGst = totalAmountWithoutGst(pencilPrice,penPrice,eraserPrice);
            double totalAmountWithGst = totalAmountWithGst(totalAmountWithoutGst);
            System.out.printf("Total Cost with 18 percent gst is: %.2f%n", totalAmountWithGst);
        } catch (Exception e) {
            System.out.println("an error occured " + e.getMessage());
        }
        
    }

    private static double getPositiveNumberInput(Scanner scanner,String prompt){
        while(true){
            System.out.print(prompt);
            if(scanner.hasNextDouble()){
                return scanner.nextDouble();
            }
            else{
                System.out.println("Wrong Input please enter an Integer !!");
                scanner.next();
            }
        }
    }

    private static double totalAmountWithoutGst(double... things){
        double sum = 0;
        for(double thing : things){
            sum+=thing;
        }
        return sum;
    }

    private static double totalAmountWithGst(double totalAmountWithoutGst){
        double gstPercentage = 1.18;
        double totalAmountWithGst = (totalAmountWithoutGst*gstPercentage);
        return totalAmountWithGst;
    }
}
