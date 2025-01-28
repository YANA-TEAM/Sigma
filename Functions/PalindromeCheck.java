public class PalindromeCheck {
    public static int reverse(int number){
        int reverse = 0;
        while(number>0){
            int lastDigit = number%10;
            reverse = (reverse*10)+(lastDigit);
            number = number/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int number = 10801;
        int reverse = reverse(number);
        if(number == reverse){
            System.out.println("Number is a Palindrome");
    }
    else{
        System.out.println("Number is not a Palindrome");
    }
    }
}
