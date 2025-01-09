import java.util.*;

public class AverageCalculator{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            int number1 = getPositiveNumberInput(scanner, "Enter Number 1: ");
            int number2 = getPositiveNumberInput(scanner, "Enter Number 2: ");
            int number3 = getPositiveNumberInput(scanner, "Enter Number 3: ");

            double average = calculateAverage(number1,number2,number3);
            System.out.printf("The average is: %.2f%n", average);

        } catch (Exception e) {
            System.out.println("an error occured" +e.getMessage());
        }
    }

    private static double calculateAverage(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum+=number;
        }
        return (double)sum/numbers.length;
    }

    private static int getPositiveNumberInput(Scanner scanner,String prompt){
        while (true) { 
            System.out.print(prompt);
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }
            else{
                System.out.println("!!Invalid Input Please enter Integer!!");
                scanner.next();
            }
        }
    }
}