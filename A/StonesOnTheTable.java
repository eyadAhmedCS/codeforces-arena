
import java.util.Scanner;

public class StonesOnTheTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.nextLine();
        char[] stones = in.nextLine().toCharArray();

        int counter = 0;

        for (int i = 1; i < n; i++) {
            char prev = stones[i - 1];
            char curr = stones[i];

            counter += prev == curr ? 1 : 0;

        }

        System.out.println(counter);
    }

}
