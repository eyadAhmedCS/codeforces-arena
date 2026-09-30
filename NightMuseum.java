
import java.util.Scanner;

public class NightMuseum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char curr = 'a';
        char[] word = in.next().toCharArray();

        int sum = 0;

        for (int i = 0; i < word.length; i++) {
            int diff = Math.abs(word[i] - curr);

            if (diff <= 13) {
                sum += diff;
            } else {
                sum += 26 - diff;
            }

            curr = word[i];
        }

        System.out.println(sum);

    }

}
