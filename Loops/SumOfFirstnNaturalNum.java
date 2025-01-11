public class SumOfFirstnNaturalNum {
    public static void main(String[] args) {
        int num = 5;
        int counter = 1;
        int sum = 0;
        while(counter <= num){
            sum+=counter;
            counter++;
        }
        System.out.println("Sum is :"+sum);
    }
}
