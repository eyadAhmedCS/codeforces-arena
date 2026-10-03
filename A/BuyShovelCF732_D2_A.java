
import java.util.Scanner;

public class BuyShovelCF732_D2_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int r = in.nextInt();

        int count = 1;
        int res = k;
        while ((res % 10 != 0) && (res - r) % 10 != 0) {
            count++;
            res = k * count;
        }

        System.out.println(count);
    }

}
