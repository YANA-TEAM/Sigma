public class ReverseOfNumber {
    public static void main(String[] args) {
        int number = 10899;
        while(number>0){
            int lastDigit = number%10;
            System.out.print(lastDigit);
            number = number/10;
        }
    }
}
