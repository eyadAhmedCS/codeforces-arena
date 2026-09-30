
import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        String prev = null;
        int count = 0;

        for (int i = 0; i < n; i++) {
            String curr = in.nextLine();

            if (prev == null || !curr.equals(prev)) {
                count++;
            }
            prev = curr;
        }

        System.out.println(count);
    }

}
