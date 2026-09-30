
import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int p = 0;
        for (int i = 0; i < n; i++) {
            int sum = in.nextInt() + in.nextInt() + in.nextInt();
            p += sum >= 2 ? 1 : 0;
        }
        System.out.println(p);

    }

}
