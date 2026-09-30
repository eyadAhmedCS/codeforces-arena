
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] s = in.nextLine().toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length; i++) {
            set.add(s[i]);
        }

        int setLen = set.size();
        if (setLen % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }

}
