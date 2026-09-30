
import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int hired = 0;
        int crime = 0;

        for (int i = 0; i < n; i++) {
            int curr = in.nextInt();

            if (curr == -1 && hired == 0) {
                crime++;
            } else if (curr == -1 && hired > 0) {
                hired--;
            } else {
                hired += curr;
            }
        }

        System.out.println(crime);
    }

}
