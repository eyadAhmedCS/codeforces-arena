
import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println(0);
        } else if (s1.compareToIgnoreCase(s2) > 0) {
            System.out.println(1);
        } else {
            int c = s1.compareTo(s2);
            System.out.println(-1);
        }

    }

}
