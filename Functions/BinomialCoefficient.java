import java.util.*;
public class BinomialCoefficient {
    public static int factorial(int number){
        int fact = 1;
        for(int i = 1; i<=number; i++){
            fact*=i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n,int r){
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nMinusRFact = factorial(n-r);
        int binomialCoefficient = nFact/(rFact*nMinusRFact);
        return binomialCoefficient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient of "+n+" and "+r+" is "+binomialCoefficient(n, r));
    }
}
