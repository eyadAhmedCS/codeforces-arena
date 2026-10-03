
import java.math.BigInteger;
import java.util.Scanner;

public class DieRollCF9_D2_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0;

        for (int i = 0; i < 2; i++) {
            int val = in.nextInt();
            max = max >= val ? max : val;
        }

        int countOfWinningPlay = 6 - max + 1;

        BigInteger numerator = BigInteger.valueOf(countOfWinningPlay);
        BigInteger denominator = BigInteger.valueOf(6);

        BigInteger gcd = numerator.gcd(denominator);

        System.out.println(numerator.divide(gcd) + "/" + denominator.divide(gcd));

    }

}
