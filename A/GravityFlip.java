
import java.util.Scanner;

public class GravityFlip {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int colNums = in.nextInt();
        int[] col = new int[colNums];

        for (int i = 0; i < colNums; i++) {
            col[i] = in.nextInt();
        }

        for (int i = 0; i < colNums; i++) {
            int x = col[i]; // 1
            for (int j = i - 1; j >= 0; j--) {
                if (x < col[j]) {
                    col[j + 1] = col[j];
                    col[j] = x;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < colNums; i++) {
            System.out.print(col[i] + " ");
        }
    }

}
