public class BinaryToDecimal {
    public static void main(String[] args){
        int number = 1010;
        int power = 0;
        int decimal = 0;
        while(number > 0){
            int lastDigit = number%10;
            decimal = decimal + (lastDigit * (int)Math.pow(2, power));
            number = number/10;
            power++;
        }
        System.out.println(decimal);
    }
}


