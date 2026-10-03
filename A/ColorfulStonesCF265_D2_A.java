
import java.util.Scanner;

public class ColorfulStonesCF265_D2_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] s = in.nextLine().toCharArray();
        char[] t = in.nextLine().toCharArray();

        int pointer = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] != s[pointer]) {
                continue;
            }
            pointer++;
        }

        System.out.println(++pointer);

    }

}
