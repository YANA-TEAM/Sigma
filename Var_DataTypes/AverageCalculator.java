import java.util.*;

public class AverageCalculator{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            int number1 = getValidInput(scanner, "Enter Number 1: ");
            int number2 = getValidInput(scanner, "Enter Number 2: ");
            int number3 = getValidInput(scanner, "Enter Number 3: ");

            double average = calculateAverage(number1,number2,number3);
            System.out.printf("The average is: %.5f", average);

        } catch (Exception e) {
            System.out.println("an error occured" +e.getMessage());
        }
    }

    private static double calculateAverage(double... numbers){
        double sum = 0;
        for(double number : numbers){
            sum+=number;
        }
        return sum/numbers.length;
    }

    private static int getValidInput(Scanner scanner,String prompt){
        while (true) { 
            System.out.print(prompt);
            if(scanner.hasNextDouble()){
                return scanner.nextDouble();
            }
            else{
                System.out.println("!!Invalid Input Please enter Integer!!");
                scanner.next();
            }
        }
    }
}