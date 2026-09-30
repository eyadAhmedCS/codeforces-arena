
import java.util.HashMap;
import java.util.Scanner;

public class BlackSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] strips = new char[]{'1', '2', '3', '4'};

        HashMap<Character, Integer> values = new HashMap<>();

        for (int i = 0; i < strips.length; i++) {
            values.put(strips[i], in.nextInt());
        }

        char[] s = in.next().toCharArray();

        int sum = 0;

        for (int i = 0; i < s.length; i++) {
            sum += values.get(s[i]);
        }

        System.out.println(sum);

    }

}
