
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        int upNum = 0;
        int lwNum = 0;

        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upNum++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                lwNum++;
            }
        }

        if (upNum > lwNum) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }

    }

}
