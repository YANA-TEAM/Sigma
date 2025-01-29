public class DecimalAndBinaryConversion {
    public static void binaryToDecimal(int number){
        int myNum = number;
        int decimal = 0;
        int power = 0;
        while(myNum > 0){
            int lastDigit = myNum%10;
            decimal = decimal + (lastDigit * (int)Math.pow(2,power));
            myNum /= 10;
            power++;
        }
        System.out.println("The Decimal Form of "+number+" is "+decimal);
    }
    public static void decimalToBinary(int number){
        int myNum = number;
        int binary = 0;
        int power = 0;
        while(myNum > 0){
            int lastDigit = myNum%2;
            binary = binary + (lastDigit * (int)Math.pow(10,power));
            myNum /= 2;
            power++;
        }
        System.out.println("The Binary Form of "+number+" is "+binary);
    }
    public static void main(String[] args) {
        int binary = 1011;
        int decimal = 11;
        binaryToDecimal(binary);
        decimalToBinary(decimal);
    }
}
