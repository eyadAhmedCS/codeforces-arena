
import java.util.HashSet;
import java.util.Scanner;

public class HorseshoeOnTheOtherHoofCF228_D2_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int colors = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            set.add(in.nextInt());
        }

        System.out.println(4 - set.size());
    }

}
