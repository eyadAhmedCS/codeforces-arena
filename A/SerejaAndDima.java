
import java.util.Scanner;

public class SerejaAndDima {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = in.nextInt();
        }

        int left = 0;
        int right = cards.length - 1;

        int s = 0;
        int d = 0;

        int curr = 0;

        while (left <= right) {
            int biggest = 0;

            if (cards[left] >= cards[right]) {
                biggest = cards[left];
                left++;
            } else {
                biggest = cards[right];
                right--;
            }

            if (curr == 0) {
                s += biggest;
            } else {
                d += biggest;
            }
            curr = curr == 0 ? 1 : 0;
        }

        System.out.println(s + " " + d);

    }

}
